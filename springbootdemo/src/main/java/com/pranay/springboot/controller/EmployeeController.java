package com.pranay.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pranay.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/getEmp/{id}")
	public String getEmp(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
}
