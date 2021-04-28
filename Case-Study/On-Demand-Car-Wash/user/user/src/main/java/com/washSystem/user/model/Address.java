package com.washSystem.user.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Address {
	@NotBlank(message = "Street can't be blank")
	@Size(min=2)
	private String street;
	@NotBlank(message = "City can't be blank")
	@Size(min=3)
	private String city;
	@NotBlank(message = "State can't be blank")
	@Size(min=3)
	private String state;
	@NotBlank(message = "Country can't be blank")
	@Size(min=3)
	private String country;
	@NotBlank(message = "Zipcode can't be blank")
	@Size(min=6,max=6,message="Should be six Digit Long")
	private String zipCode;
	
	public Address(String street, String city, String state, String country, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	public Address() {
		super();
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	};
}
