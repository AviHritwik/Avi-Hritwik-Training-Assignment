package com.washsystem.receiptmanagement.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="WashServices")
public class WashServices {
	@Id
	@NotBlank(message = "Service name is must")
	private String serviceName;
	@NotBlank(message="Description must be given")
	private String serviceDescription;
	@NotBlank
	private double cars;
	@NotBlank
	private double midSuv;
	@NotBlank
	private double suv;
	@NotBlank(message = "Status must be filled")
	private boolean status;
	
	public WashServices() {
	}
	public WashServices(String serviceName, String serviceDescription, @NotNull double cars,
			@NotNull double midSuv, @NotNull double suv, @NotNull boolean status) {
		this.serviceName = serviceName;
		this.serviceDescription = serviceDescription;
		this.cars = cars;
		this.midSuv = midSuv;
		this.suv = suv;
		this.status = status;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	public double getCars() {
		return cars;
	}
	public void setCars(double cars) {
		this.cars = cars;
	}
	public double getMidSuv() {
		return midSuv;
	}
	public void setMidSuv(double midSuv) {
		this.midSuv = midSuv;
	}
	public double getSuv() {
		return suv;
	}
	public void setSuv(double suv) {
		this.suv = suv;
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
