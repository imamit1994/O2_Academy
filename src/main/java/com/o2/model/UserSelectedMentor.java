package com.o2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserSelectedMentor")
public class UserSelectedMentor {
	@Id
	String associateId;
	String mentorId;
	public String getMentorId() {
		return mentorId;
	}
	public void setMentorId(String mentorId) {
		this.mentorId = mentorId;
	}
	public String getAssociateId() {
		return associateId;
	}
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
	
}
