package com.dhs.demo.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dhs.demo.model.UserDetails;

public interface UserDetailsRepository extends MongoRepository<UserDetails, String>{
	
	public Optional<UserDetails> findById(String id);

}
