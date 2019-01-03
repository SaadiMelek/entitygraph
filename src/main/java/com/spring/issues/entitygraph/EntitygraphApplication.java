package com.spring.issues.entitygraph;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.issues.entitygraph.repository.HouseRepository;

@SpringBootApplication
public class EntitygraphApplication implements CommandLineRunner {

	@Autowired
	HouseRepository houseRepository;

	public static void main(String[] args) {
		SpringApplication.run(EntitygraphApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}