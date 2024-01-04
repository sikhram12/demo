package com.sparkle.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sparkle.demo.model.Order;

public interface OrderRepository extends MongoRepository<Order,String> {
    
}
