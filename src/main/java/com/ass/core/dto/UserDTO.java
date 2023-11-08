package com.ass.core.dto;

import java.io.Serializable;

public class UserDTO implements Serializable{
	private int altKey;
	
	private String firstName;
	
	private String lastName;
	
	private String course;
	
	public int getAltKey() {
		return altKey;
	}
	public void setAltKey(int altKey) {
		this.altKey = altKey;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
