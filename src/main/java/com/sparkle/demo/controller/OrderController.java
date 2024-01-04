package com.sparkle.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sparkle.demo.model.Order;
import com.sparkle.demo.service.OrderService;

@RestController
@RequestMapping(value="/Mynthra")
public class OrderController {
   @Autowired
   OrderService orderService;
   
   @PostMapping("/addToCart")
   public Order addToCart(@RequestBody Order o) {
		return orderService.addToCart(o);
	}
    @DeleteMapping("/removeItemFromCart/{Id}")
	public String removeOrderFromCart(@PathVariable String Id) {
    	return orderService.removeOrderFromCart(Id);}
    
    @PostMapping("/updateOrder")
	public String updateOrderDetails(Order o) {
		return orderService.updateOrderDetails(o);
	}
    
    @GetMapping("/getDetails")
	public List<Order> getOrderDetails(){
		return orderService.getOrderDetails();
		
	}
}
