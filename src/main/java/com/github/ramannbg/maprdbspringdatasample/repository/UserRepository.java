package com.github.ramannbg.maprdbspringdatasample.repository;

import com.github.ramannbg.maprdbspringdatasample.model.User;
import com.mapr.springframework.data.maprdb.repository.MapRRepository;

public interface UserRepository extends MapRRepository<User, String> {
}
