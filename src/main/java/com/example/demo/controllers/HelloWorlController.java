package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
