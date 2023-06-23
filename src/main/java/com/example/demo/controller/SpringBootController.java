package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringBootController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to spring jenkins docker example....";
	}

}
