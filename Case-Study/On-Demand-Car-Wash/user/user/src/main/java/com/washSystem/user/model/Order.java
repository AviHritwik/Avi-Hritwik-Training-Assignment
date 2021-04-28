package com.washSystem.user.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Order {

	private long orderId;
	private long washerId;
	private long userId;
	private double amount;
	private Address address;
	private String status;
	
	
	public Order() {
	}
	public Order(long orderId, long washerId, long userId, double amount, Address address, String status) {
		this.orderId = orderId;
		this.washerId = washerId;
		this.userId = userId;
		this.amount = amount;
		this.address = address;
		this.status = status;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getWasherId() {
		return washerId;
	}
	public void setWasherId(long washerId) {
		this.washerId = washerId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
