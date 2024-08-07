package com.missTravveller.app.service;

import java.util.List;
import java.util.UUID;

import com.missTravveller.app.model.User;

public interface UserService {
	

	User createUser(User user);
	User getUserById(UUID id);
	User getUserByEmail(String email);
	User updateUser(User user, UUID id);
	void deleteUser(UUID id);
	User findByEmailAndPassword(String email ,String password); // PREGUNTAR SI SE PUEDE PORQUE EN DTO NO USAS CONTRASEÑA 
	List<User> getAllUsers();

}
