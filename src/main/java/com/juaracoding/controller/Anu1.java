package com.juaracoding.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Anu1 {

	@DeleteMapping("/anu1")
	private String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello world! Good night!ini del  anu1";
	}

	@PostMapping("/anu1")
	private String helloWorld1() {
		// TODO Auto-generated method stub
		return "Hello world! Good night! ini post anu1";
	}
	@GetMapping("/anu1")
	private String helloWorld2() {
		// TODO Auto-generated method stub
		return "Hello world! Good night! ini get anu1";
	}
}
