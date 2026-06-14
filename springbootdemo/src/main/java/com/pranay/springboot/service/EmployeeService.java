package com.pranay.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	public String getEmployee(int id) {
		if(id==1) {
			return "Pranay";
		}else {
			return "Employee not found";
		}
	}

}
	