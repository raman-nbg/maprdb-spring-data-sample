package com.github.ramannbg.maprdbspringdatasample;

import com.mapr.springframework.data.maprdb.repository.config.EnableMapRRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMapRRepository
public class MaprdbSpringDataSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaprdbSpringDataSampleApplication.class, args);
	}

}
