package com.pranay.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	
	//http://localhost:8080/add?a=10&b=20
	
	@GetMapping("/add")
	public int add(@RequestParam int a,@RequestParam int b) {
		return a+b;
	}
	
	//http://localhost:8080/multiply/10/20
	@GetMapping("/multiply/{a}/{b}")
	public int multiply(@PathVariable int a,@PathVariable int b) {
		return a*b;
	}
}
