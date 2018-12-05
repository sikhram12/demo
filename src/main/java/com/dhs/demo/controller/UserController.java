package com.dhs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhs.demo.model.UserDetails;
import com.dhs.demo.service.UserDetailsService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@PostMapping("/createUser")
	public UserDetails createUserDetails(@RequestBody UserDetails userDetails){
		return userDetailsService.createUserDetails(userDetails);
	}
	
	@GetMapping("/getAllUserDetails")
	public List<UserDetails> getAllUserDetails(){
		return userDetailsService.getAllUserDetails();
	}
	
	@PostMapping("/updateUserDetails")
	public String updateUserDetails(@RequestBody UserDetails userDetails){
		return userDetailsService.updateUserDetails(userDetails);
	}
	
	@GetMapping("/deleteUserDetails/{id}")
	public String deleteUserDetails(@PathVariable String id){
		return userDetailsService.deleteUserDetails(id);
	}
	
	@GetMapping("/test")
	public String test(){
		return "Sucess";
	}
}
