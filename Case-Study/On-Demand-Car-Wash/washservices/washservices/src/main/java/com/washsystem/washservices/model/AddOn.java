package com.washsystem.washservices.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "AddOn")
public class AddOn {
	
	@Id
	@NotBlank(message = "Service name is must")
	private String addOnName;
	@NotBlank(message="Description must be given")
	private String addOnDescription;
	@NotNull
	private double cost;
	@NotBlank(message="Status must be filled")
	private boolean status;
	
	public AddOn() {
	}
	
	public AddOn(String addOnName, @NotNull String addOnDescription, @NotNull double cost, boolean status) {
		this.addOnName = addOnName;
		this.addOnDescription = addOnDescription;
		this.cost = cost;
		this.status = status;
	}

	public String getAddOnName() {
		return addOnName;
	}

	public void setAddOnName(String addOnName) {
		this.addOnName = addOnName;
	}

	public String getAddOnDescription() {
		return addOnDescription;
	}

	public void setAddOnDescription(String addOnDescription) {
		this.addOnDescription = addOnDescription;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return status;
	}
	
}
