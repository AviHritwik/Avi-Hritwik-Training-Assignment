package com.bezkoder.spring.jwt.mongodb.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

public class Washer {
	@Id
	private long washerId;
	@NotBlank(message = "Email can't be blank")
	@Email
	private String email;
	@NotBlank(message = "Name can't be blank")
	@Size(min=3)
	private String name;
	
	public Washer() {}
	public Washer(long washerId, @NotBlank(message = "Email can't be blank") @Email String email,
			@NotBlank(message = "Name can't be blank") @Size(min = 3) String name) {
		super();
		this.washerId = washerId;
		this.email = email;
		this.name = name;
	}
	public long getWasherId() {
		return washerId;
	}
	public void setWasherId(long washerId) {
		this.washerId = washerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
