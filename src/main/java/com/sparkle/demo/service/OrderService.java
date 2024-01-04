package com.sparkle.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparkle.demo.dao.OrderRepository;
import com.sparkle.demo.model.Order;

@Service
public class OrderService {

	@Autowired 
	OrderRepository orderRepository;
	public Order addToCart(Order o) {
		Order orderObj=orderRepository.save(o);
		return orderObj;
	}
	public String removeOrderFromCart(String Id) {
		orderRepository.deleteById(Id);
		return "Deleted From the Cart Successfully";
	}
	public String updateOrderDetails(Order o) {
		orderRepository.save(o);
		return "Order details are successfully updated"; 
	}
	public List<Order> getOrderDetails(){
		List<Order> l=orderRepository.findAll();
		return l;
	}
	
}
