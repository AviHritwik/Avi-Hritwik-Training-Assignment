package com.washsystem.receiptmanagement.model;

import java.util.HashMap;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Receipt")
public class Receipt {
	@Id
	private long receiptId;
	@NotBlank(message="")
	@Size(min=10,max=10)
	private String orderDate;
	private HashMap<String,Double> serviceDetail;
	
}
