package com.missTravveller.app.service.impl;


import java.util.UUID;

import org.springframework.stereotype.Service;

import com.missTravveller.app.dto.UserDTO;
import com.missTravveller.app.model.User;
import com.missTravveller.app.service.UserDTOService;
import com.missTravveller.app.service.UserService;
import com.missTravveller.app.util.UserConverter;

@Service
public class UserDTOServiceImpl implements UserDTOService{

	//nuestros atributos 
	UserService userService;

	
	public UserDTOServiceImpl(UserService userService) {
		this.userService = userService;
	}


	@Override
	public UserDTO createUser(User user) {
		User newUser = userService.createUser(user);
		return UserConverter.userToUserDto(newUser);
	}

	
	@Override
	public UserDTO getUserById(UUID id) {
		return UserConverter.userToUserDto( userService.getUserById(id));
	}

	@Override
	public UserDTO getUserByEmail(String email) {
		return UserConverter.userToUserDto( userService.getUserByEmail(email));
	}

	@Override
	public UserDTO updateUser(User user, UUID id) {
		return UserConverter.userToUserDto( userService.updateUser(user, id));
	}

	@Override
	public void deleteUser(UUID id) {
		userService.deleteUser(id);
	}


	@Override
	public Iterable<UserDTO> getAllUser() {
		return UserConverter.userToUserDto( userService.getAllUser() );
	}

}
