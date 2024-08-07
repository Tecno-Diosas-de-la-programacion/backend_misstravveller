package com.missTravveller.app.service.impl;

import java.util.List;
import java.util.UUID;



import com.missTravveller.app.dto.UserDTO;
import com.missTravveller.app.model.User;
import com.missTravveller.app.repository.UserRepository;
import com.missTravveller.app.service.UserDTOService;

public class UserDtoServiceImpl implements UserDTOService{

	//nuestros atributos 
	UserRepository userRepository;
	
	
	
	//nuestro metodo contructor 
	
	public UserDtoServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;

	}

	
	@Override
	public UserDTO createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public UserDTO getUserById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO updateUser(User user, UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
