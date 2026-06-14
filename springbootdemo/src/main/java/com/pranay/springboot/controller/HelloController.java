package com.pranay.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World this is pranay and we will rock the world in few days. be ready bro....";
	}
	
	@GetMapping("/square")
	public int getSquare(@RequestParam int number) {
		return number*number;
	}

}
