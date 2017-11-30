package com.o2.model;

public class UserInfo {
	//String _id;
	String name;
	String associateId;
	String emailId;
	String userName;
	String password;
	String role;
	/*public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}*/
	
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserInfo(String name, String associateId, String emailId, String userName, String password, String role) {
		super();
		this.name = name;
		this.associateId = associateId;
		this.emailId = emailId;
		this.userName = userName;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}