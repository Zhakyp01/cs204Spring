package com.example.cs204;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Cs204Application {

	public static void main(String[] args) {
		SpringApplication.run(Cs204Application.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "<h1>Hello MY DEAR</h1>";
	}

}
