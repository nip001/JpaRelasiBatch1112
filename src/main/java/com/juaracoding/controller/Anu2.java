package com.juaracoding.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Anu2 {

	@DeleteMapping("/anu2")
	private String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello world! Good night!ini del anu2";
	}

	@PostMapping("/anu2")
	private String helloWorld1() {
		// TODO Auto-generated method stub
		return "Hello world! Good night! ini post anu2";
	}

	@GetMapping("/anu2")
	private String helloWorld2() {
		// TODO Auto-generated method stub
		return "Hello world! Good night! ini get anu 2";
	}
}
