package com.example.gitdemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/greeting")
	public String sayGreeting() {
		return "Greetings from Spring Boot!";
	}
}
