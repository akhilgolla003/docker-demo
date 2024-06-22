package com.example.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

	@GetMapping
	public String wish() {
		return "Hello Akhil!!!!";
	}
	
}
