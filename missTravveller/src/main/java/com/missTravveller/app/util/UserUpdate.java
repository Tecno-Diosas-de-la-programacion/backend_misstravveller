package com.missTravveller.app.util;

import com.missTravveller.app.model.User;

public class UserUpdate {

	private UserUpdate() {}

	public static User updateUser(User existingUser, User newUserData) {
		if (existingUser == null || newUserData == null) {
			throw new IllegalArgumentException("User data cannot be null");
		}
		
		existingUser.setName(newUserData.getName());
		existingUser.setFatherLastName(newUserData.getFatherLastName() );
		existingUser.setMotherLastName(newUserData.getMotherLastName());
		existingUser.setEmail(newUserData.getEmail());
		existingUser.setPassword(newUserData.getPassword());


		return existingUser;
	}
}
