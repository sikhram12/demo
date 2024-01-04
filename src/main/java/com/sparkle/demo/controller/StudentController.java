package com.sparkle.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sparkle.demo.model.Student;
import com.sparkle.demo.service.StudentService;

@RestController
@RequestMapping(value="studentData")
public class StudentController {
   @Autowired
   StudentService studentService;
   
   @PostMapping("/addNewStudent")
	public Student createNewStudent(@RequestBody Student student){
		return studentService.createStudent(student);
	}
   
   @GetMapping("/getAllStudentsList")
   public List<Student> getAllStudentList(){
	   return studentService.getAllStudentList();
   }
   
   @PostMapping("/updateStudent")
   public String updateStudent(@RequestBody Student student) {
	   return studentService.updateStudent(student);
   }
   
   @GetMapping("/deleteStudent/{id}")
   public String deleteStudent(@PathVariable String id){
	   return studentService.deleteStudent(id);   
   }
}
