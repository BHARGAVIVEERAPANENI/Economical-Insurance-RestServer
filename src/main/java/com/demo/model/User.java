package com.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("userInfo")
public class User {
	private String  userName;
	@Id
	private int  userId;
	private String  email;
	private String  firstName;
	private String  lastName;
	private String  department;
	private String  location;
	
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", department=" + department + ", location=" + location + "]";
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(String userName, int userId, String email, String firstName, String lastName, String department,
			String location) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.location = location;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}




	

}
