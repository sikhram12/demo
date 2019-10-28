package com.dhs.demo.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dhs.demo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	public Optional<Employee> findById(String id);

}
