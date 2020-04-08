package com.github.ramannbg.maprdbspringdatasample.controller;

import com.github.ramannbg.maprdbspringdatasample.model.User;
import com.github.ramannbg.maprdbspringdatasample.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/users/{userId}")
    public ResponseEntity<User> getUser(@RequestParam String userId) {
        Optional<User> user = userRepository.findById(userId);

        if (!user.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(user.get());
    }

    @GetMapping(path = "/users")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody User user) {
        User createdUser = userRepository.insert(user);

        return ResponseEntity.ok(createdUser);
    }
}
