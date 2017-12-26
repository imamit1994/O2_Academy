package com.o2.model;


import org.springframework.data.mongodb.core.mapping.Document;
/*
 * UserInfo is the collection name inside mongo DB database
 */
@Document(collection = "UserInfo")
public class UserInfo {



	String associateId;
	String name;
	String emailId;
	String password;
	String role;
	String confirmPassword;
	
	
	public String getName() {
		return name;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserInfo() {
		
	}
	public UserInfo(String name, String associateId, String emailId, String password, String role) {
		super();
		this.name = name;
		this.associateId = associateId;
		this.emailId = emailId;
		this.password = password;
		this.role=role;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAssociateId() {
		return associateId;
	}
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
