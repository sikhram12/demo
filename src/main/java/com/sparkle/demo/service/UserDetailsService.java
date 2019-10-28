package com.sparkle.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparkle.demo.dao.UserDetailsRepository;
import com.sparkle.demo.model.UserDetails;

@Service
public class UserDetailsService {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	public UserDetails createUserDetails(UserDetails userDetails){
		UserDetails userDetails1 = userDetailsRepository.save(userDetails);
		return userDetails1;
		
	}

	public List<UserDetails> getAllUserDetails() {
		List<UserDetails> userDetailsList = userDetailsRepository.findAll();
		return userDetailsList;
	}

	public String updateUserDetails(UserDetails userDetails) {
		userDetailsRepository.save(userDetails);
		return "User Details Sucessfully updated";
	}

	public String deleteUserDetails(String id) {
		userDetailsRepository.deleteById(id);
		return "User Details Sucessfully deleted";
	}

}
