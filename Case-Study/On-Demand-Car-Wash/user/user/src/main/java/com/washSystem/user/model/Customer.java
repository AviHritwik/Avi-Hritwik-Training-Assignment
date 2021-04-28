package com.washSystem.user.model;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Customer")
public class Customer {
	
	
	@Id
	private long customerID;
	@NotBlank(message = "Email is Compulsory")
	@Email
	private String customerEmail;
	@NotBlank(message = "Name is Compulsory")
	@Size(min=3)
	private String customerName;
	@Valid
	private List<Address> customerAddress;
	@Valid
	private List<CardDetail> cardDetails;
	private List<Cars> cars;
	@NotNull
	private boolean status;
	
	
	
	public Customer() {
	}
	public Customer(long customerID, @NotBlank(message = "Email is Compulsory") @Email String customerEmail,
			@NotBlank(message = "Name is Compulsory") @Size(min = 3) String customerName,
			@NotNull List<Address> customerAddress, List<CardDetail> cardDetails, List<Cars> cars, @NotNull boolean status) {
		this.customerID = customerID;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.cardDetails = cardDetails;
		this.cars = cars;
		this.status = status;
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
	public List<Address> getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(List<Address> customerAddress) {
		this.customerAddress = customerAddress;
	}
	public List<CardDetail> getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(List<CardDetail> cardDetails) {
		this.cardDetails = cardDetails;
	}
	public List<Cars> getCars() {
		return cars;
	}
	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
