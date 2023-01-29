package com.sparkle.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection = "uscities")
@Data
public class UsaCities {
	@Id
	@Field("_id")
	private String id;
	private String city;
	private String state_id;
	private String state_name;
	private String zipcode;
	
}

	
	