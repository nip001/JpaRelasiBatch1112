package com.juaracoding.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@DeleteMapping("/")
	private String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello world! Good night!";
	}

	@PostMapping("/")
	private String helloWorld1() {
		// TODO Auto-generated method stub
		return "Hello world! Good night! ini post";
	}

	@GetMapping("/")
	private String helloWorld2() {
		// TODO Auto-generated method stub
		return "Hello world! Good night! ini get";
	}
}