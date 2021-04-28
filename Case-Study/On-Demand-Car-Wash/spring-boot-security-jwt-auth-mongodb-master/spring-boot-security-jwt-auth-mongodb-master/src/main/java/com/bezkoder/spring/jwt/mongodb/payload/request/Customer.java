package com.bezkoder.spring.jwt.mongodb.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	private long customerID;
	@NotBlank(message = "Email is Compulsory")
	@Email
	private String customerEmail;
	@NotBlank(message = "Name is Compulsory")
	@Size(min=3)
	private String customerName;
	
	public Customer() {}
	
	public Customer(long customerID, @NotBlank(message = "Email is Compulsory") @Email String customerEmail,
			@NotBlank(message = "Name is Compulsory") @Size(min = 3) String customerName) {
		super();
		this.customerID = customerID;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
	}
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
