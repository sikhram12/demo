package com.sparkle.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sparkle.demo.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
       
}
