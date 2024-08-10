package com.missTravveller.app.dto;

import java.util.UUID;

public class UserDTO {
	
	private UUID serialNumber; 
	private String firstName;
	private String lastName;
	private String email;


	public UserDTO () {}


	public UUID getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(UUID serialNumber) {
		this.serialNumber = serialNumber;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
