package com.sparkle.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparkle.demo.dao.StudentRepository;
import com.sparkle.demo.model.Student;

@Service
public class StudentService {

 @Autowired
 StudentRepository studentRepository;
 

 public Student createStudent(Student student) {
	 Student savedStudentObj=studentRepository.save(student);
	 return savedStudentObj;
 }
 
 public List<Student> getAllStudentList(){
	 List<Student> studentList = studentRepository.findAll();
		return studentList;
 }
 
 public String updateStudent(Student student) {
	 studentRepository.save(student);
	 return "Student Details Successfully updated";
 }
 
 public String deleteStudent(String Id) {
	 studentRepository.deleteById(Id);
	 return "Student details got deleted successfully";
 }
}
