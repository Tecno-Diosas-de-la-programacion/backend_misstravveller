package com.missTravveller.app.service;


import java.util.UUID;

import com.missTravveller.app.model.User;

public interface UserService {
	

	User createUser(User user);
	User getUserById(UUID id);
	User getUserByEmail(String email);
	User updateUser(User user, UUID id);
	void deleteUser(UUID id);
	Iterable<User> getAllUser();

}
