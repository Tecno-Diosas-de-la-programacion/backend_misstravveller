package com.missTravveller.app.service.impl;


import java.util.Optional;
import java.util.UUID;

//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.missTravveller.app.model.User;
import com.missTravveller.app.repository.UserRepository;
import com.missTravveller.app.service.UserService;
import com.missTravveller.app.util.UserUpdate;

@Service
public class UserServiceImpl implements UserService {

	//nuestros atributos 
	UserRepository userRepository;
	 UserService userService;
//	PasswordEncoder passwordEncoder; // esto de la carpeta de security
			
			
    //nuestro metodo contructor 
				
	public UserServiceImpl(UserRepository userRepository, UserService userService) {
		this.userRepository = userRepository;
		this.userService = userService;
//		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public User createUser(User user) {
		String email = user.getEmail();
		if( userRepository.existsByEmail(email) ) {
			throw new IllegalStateException("The email " + email + " is already registered.");
		}
		user.setId(null);
//		user.setPassword( passwordEncoder.encode( user.getPassword() ));
		User newUser = saveUser(user);
		return newUser;
	}
	

	private User saveUser(User user) {
		return userRepository.save(user);
	}
	
	
	@Override
	public User getUserById(UUID id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if( optionalUser.isEmpty() ) {
			throw new IllegalStateException("User does not exist with id " + id);
		}
		return optionalUser.get();
	}

	@Override
	public User getUserByEmail(String email) {
		Optional<User> optionalUser = userRepository.findByEmail(email);
		if( optionalUser.isEmpty() ) {
			throw new IllegalStateException("User does not exist with email " + email);
		}
		return optionalUser.get();
	}

	@Override
	public User updateUser(User  newUserData, UUID id) {

		User existingUser = getUserById(id);
		return UserUpdate.updateUser(existingUser, newUserData);
	}

	@Override
	public void deleteUser(UUID id) {
		User existingUser = getUserById(id);
		saveUser(existingUser);
		
	}



	@Override
	public Iterable<User> getAllUser() {
		return  userService.getAllUser();
	}
	
	

}
