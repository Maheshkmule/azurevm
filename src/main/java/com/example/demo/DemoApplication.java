package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping
public class DemoApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Jenkins azure application";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
