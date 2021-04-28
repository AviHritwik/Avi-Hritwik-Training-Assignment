package com.washSystem.user.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Admin")
public class Admin {
	
	@Transient
    public static final String SEQUENCE_NAME = "admin_sequence";
	
	@Id
	@NotNull
	private long adminId;
	@NotNull
	private String adminName;
	
	
	public Admin() {
	}
	public Admin(@NotNull long adminId, @NotNull String adminName) {
		this.adminId = adminId;
		this.adminName = adminName;
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	
	
}
