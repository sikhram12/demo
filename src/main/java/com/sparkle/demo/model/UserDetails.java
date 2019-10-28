package com.sparkle.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection = "documents")
@Data
public class UserDetails {
	
	@Id
	@Field("_id")
	private String id;
	private String name;
	private String age;
	private String phone;

}
