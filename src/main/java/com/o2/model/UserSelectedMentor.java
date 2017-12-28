package com.o2.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserSelectedMentor")
public class UserSelectedMentor {
	UserInfo userInfo;
	String mentorId;
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public String getMentorId() {
		return mentorId;
	}
	public void setMentorId(String mentorId) {
		this.mentorId = mentorId;
	}
	
}
