package com.o2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SelectCource")
public class SelectCourse {
	@Id
	String associateId;
	String[] frontendtrack;
	String[] backendtrack;
	public String[] getFrontendtrack() {
		return frontendtrack;
	}
	public void setFrontendtrack(String[] frontendtrack) {
		this.frontendtrack = frontendtrack;
	}
	public String[] getBackendtrack() {
		return backendtrack;
	}
	public void setBackendtrack(String[] backendtrack) {
		this.backendtrack = backendtrack;
	}
	public String getAssociateId() {
		return associateId;
	}
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
	
}
