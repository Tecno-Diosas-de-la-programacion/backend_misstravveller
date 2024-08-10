package com.missTravveller.app.service.impl;


import java.util.Optional;
import java.util.UUID;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.missTravveller.app.model.User;
import com.missTravveller.app.repository.UserRepository;
import com.missTravveller.app.service.UserService;
import com.missTravveller.app.util.PasswordUtils;
import com.missTravveller.app.util.UserUpdate;

@Service
public class UserServiceImpl implements UserService {

	//nuestros atributos 
	UserRepository userRepository;
	
//	PasswordEncoder passwordEncoder; // esto de la carpeta de security
			
			
    //nuestro metodo contructor 
				
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
		
//		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public User createUser(User user) {
		String email = user.getEmail();
		if( userRepository.existsByEmail(email) ) {
			throw new IllegalStateException("The email " + email + " is already registered."); //devuelve si es que el correo ha sido registrado 
		}
		user.setId(null);
		user.setPassword( PasswordUtils.encryptPassword( user.getPassword() )); //encripta la contraseña 
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
			throw new IllegalStateException("User does not exist with id " + id); //excepcion si no existe ese Id
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
		User existingUser = userRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));

	        // Actualiza el usuario con los nuevos datos
	        existingUser = UserUpdate.updateUser(existingUser, newUserData);

	        // Guarda el usuario actualizado en la base de datos
	        return userRepository.save(existingUser);
		
	}

	@Override
	public void deleteUser(UUID id) {
		userRepository.deleteById(id);
	}


	@Override
    public Iterable<User> getAllUser() {
        return userRepository.findAll();  // Llama a findAll() en la instancia del repositorio
    }



	

}
