package com.pranay.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@GetMapping("/name")
	public String getName() {
		return "Pranay";
	}
	
	
    @GetMapping("/role")
	public String getRole() {
		return "Java Backend Developer";
	}
	
	@GetMapping("/target")
	public String getTarget() {
		return "15 LPA";
	}
	
	@GetMapping("/company")
	public String getCompany() {
		return "RML";
	}
}
