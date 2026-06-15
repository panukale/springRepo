package com.pranay.springboot.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.pranay.springboot.model.Employee;
import com.pranay.springboot.model.EmployeeResponseDto;
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

	@GetMapping("/employee")
	public EmployeeResponseDto getEmployee() {
		return employeeService.getEmployee();

	}

	@GetMapping("/save-employee")
	public Employee saveEmployee() {
		return employeeService.saveEmployee();
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/getCount")
	public long getCount() {
		return employeeService.getEmployeeCount();
	}

	@GetMapping("/removeEmp/{id}")
	public void removeEmp(@PathVariable long id) {
		employeeService.deleteEmployee(id);
	}
}
