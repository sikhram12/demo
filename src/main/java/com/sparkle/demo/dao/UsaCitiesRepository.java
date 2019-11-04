package com.sparkle.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sparkle.demo.model.UsaCities;

public interface UsaCitiesRepository extends MongoRepository<UsaCities, String>{


}
