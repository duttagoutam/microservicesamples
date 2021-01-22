package com.example.demo.model;

public class User {
	
	private String lastName;
	private String firstName;	
	
	public User() {
		super();
	}

	public User(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String toString() {
		return "User [lastName=" + lastName + ", firstName=" + firstName + "]";
	}
}
