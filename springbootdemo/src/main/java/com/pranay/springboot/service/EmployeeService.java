package com.pranay.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.pranay.springboot.model.Employee;
import com.pranay.springboot.model.EmployeeResponseDto;
import com.pranay.springboot.repository.EmployeeRepository;


@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public Employee saveEmployee() {
		Employee employee = new Employee(null, "Pranay", 500000.00);
		return employeeRepository.save(employee);
	}

	public String getEmployee(int id) {
		if (id == 1) {
			return "Pranay";
		} else {
			return "Employee not found";
		}
	}

	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public EmployeeResponseDto getEmployee() {
		return new EmployeeResponseDto(1, "Pranay");
	}
	
	public List<Employee> getAllEmployees() {
	    return employeeRepository.findAll();
	}

	public long getEmployeeCount() {
	    return employeeRepository.count();
	}

	public void deleteEmployee(Long id) {
	    employeeRepository.deleteById(id);
	}
}
