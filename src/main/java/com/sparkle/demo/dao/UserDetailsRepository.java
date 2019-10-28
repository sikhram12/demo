package com.sparkle.demo.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sparkle.demo.model.UserDetails;

public interface UserDetailsRepository extends MongoRepository<UserDetails, String>{
	
	public Optional<UserDetails> findById(String id);

}
