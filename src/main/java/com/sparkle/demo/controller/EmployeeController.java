package com.sparkle.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sparkle.demo.model.Employee;
import com.sparkle.demo.model.UsaCities;
import com.sparkle.demo.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value = "/employee1")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/createNewEmployee")
	public ResponseEntity<List<Employee>>  createNewEmployee(@RequestBody List<Employee>  employee){
		return ResponseEntity.ok(employeeService.createEmployee(employee));
	}
	
	@GetMapping("/getAllEmployesList")
	public List<Employee> getAllEmployesList(){
		return employeeService.getAllEmployesList();
	}
	
	@PostMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee Employee){
		return employeeService.updateEmployee(Employee);
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable String id){
		return employeeService.deleteEmployee(id);
	}
	
	
	//Added the Search API
	@GetMapping("/search/{firstName}")
	public Optional<Employee> searchEmployee(@PathVariable String firstName) {
		return employeeService.getEmployee(firstName);
	}
	
	@GetMapping("/search")
	public List<Employee> searchEmployeeByLastName(@RequestParam(required=false) String lastName){
		return employeeService.getEmployeeByLastName(lastName);
	}
	
	@GetMapping("/test")
	public String test(){
		return "Sucess";
	}
	
	@GetMapping("/allCities")
	public List<UsaCities> fetchAllUsaCities(){
		return employeeService.fetchAllUsaCities();
	}
	
	@GetMapping("/stateWithCities")
	public Map<String, Map<String, String>> stateWithCities(){
		return employeeService.stateWithCities();
	}
}
