package com.mamasclub.happyjar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HappyJarApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyJarApplication.class, args);
	}

}
