package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;

@SpringBootApplication
public class DemoApplication
{

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);


	}
}

