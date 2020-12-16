package com.sparkle.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.sparkle.demo.model.Address;
import com.sparkle.demo.service.Producer;

//@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	private final Producer producer;

	@Autowired
	public KafkaController(Producer producer) {
		this.producer = producer;
	}

	@PostMapping(value = "/publish")
	public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
		Address add = new Address();
		add.setAddress1("address1");
		add.setAddress2("address2");
		add.setAddress3("address34");
		
		Gson gson = new Gson();
		
		this.producer.sendMessage(gson.toJson(add));
	}
	
	//@KafkaListener(topics = "users")
	public void dashboardMetricsListener(String data) {
		
	}
}