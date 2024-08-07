package com.missTravveller.app.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.missTravveller.app.model.User;
import com.missTravveller.app.repository.UserRepository;
import com.missTravveller.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//nuestros atributos 
	UserRepository userRepository;
	PasswordEncoder passwordEncoder; // esto de la carpeta de security
			
			
    //nuestro metodo contructor 
				
	public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public User createUser(User user) {
		String email = user.getEmail();
		if( userRepository.existsByEmail(email) ) {
			throw new IllegalStateException("The email " + email + " is already registered.");
		}
		user.setId(null);
		user.setPassword( passwordEncoder.encode( user.getPassword() ));
		User newUser = saveUser(user);
		return newUser;
	}
	

	private User saveUser(User user) {
		return userRepository.save(user);
	}
	
	
	@Override
	public User getUserById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user, UUID id) {
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
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
