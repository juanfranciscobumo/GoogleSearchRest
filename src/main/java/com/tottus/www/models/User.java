package com.tottus.www.models;

public class User {

	private String token;
	private String firstName;
	private String lastName;

	public User(String token, String firstName, String lastName) {
		this.token = token;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getToken() {
		return token;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
