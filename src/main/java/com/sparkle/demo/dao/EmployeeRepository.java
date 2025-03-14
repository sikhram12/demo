package com.sparkle.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sparkle.demo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	public Optional<Employee> findById(String id);
	
	@Query("{'firstName':?0}")
	public Optional<Employee> findByFirstName(String firstName);
	
	public List<Employee> findByLastName(String LastName);

}
