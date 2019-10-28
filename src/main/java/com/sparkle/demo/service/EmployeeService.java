package com.sparkle.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparkle.demo.dao.EmployeeRepository;
import com.sparkle.demo.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee createEmployee(Employee employee){
		Employee savedEmployeeObj = employeeRepository.save(employee);
		return savedEmployeeObj;
		
	}

	public List<Employee> getAllEmployesList() {
		List<Employee> employesList = employeeRepository.findAll();
		return employesList;
	}

	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee Details Sucessfully updated";
	}

	public String deleteEmployee(String id) {
		employeeRepository.deleteById(id);
		return "Employee Details Sucessfully deleted";
	}

}
