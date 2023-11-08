package com.ass.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="user_entries")
public class UserEntity implements Serializable{
	
	@Id
	@GenericGenerator(name="auto_incre",strategy="increment")
	@GeneratedValue(generator="auto_incre")
	@Column(name="altKey")
	private int altKey;
	
	@Column(name="fist_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="course")
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

	@Override
	public String toString() {
		return "UserEntity [altKey=" + altKey + ", firstName=" + firstName + ", lastName=" + lastName + ", course="
				+ course + "]";
	}
}
