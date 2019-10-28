package com.sparkle.demo.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sparkle.demo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	public Optional<Employee> findById(String id);

}
