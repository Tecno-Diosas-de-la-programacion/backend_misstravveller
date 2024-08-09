package com.missTravveller.app.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.missTravveller.app.model.User;
import com.missTravveller.app.service.UserService;

@RestController //indica que es controller de API REST
@RequestMapping("api/v1/users") // endpoints
@CrossOrigin(origins = "*") //Permite origenes cruzados, de los puertos. 
public class UserController {
	
	UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	} 
	
	@PostMapping
	ResponseEntity<User> createUser(@RequestBody User user) {
		User newUser = userService.createUser(user);
		return ResponseEntity.status(201).body(newUser);
		// return new ResponseEntity<User>(newUser, HttpStatus.CREATED);
	}

	@GetMapping("{id}") // api/v1/users/10
	ResponseEntity<User> getUserById(@PathVariable UUID id) {
		User existingUser = userService.getUserById(id);
		return ResponseEntity.ok(existingUser);
	}

	
	@GetMapping
	ResponseEntity<Iterable<User>> getAllUsers() {
		Iterable<User> existingUsers = userService.getAllUser();
		return ResponseEntity.ok(existingUsers);
	}

	@PutMapping("{id}")
	ResponseEntity<User> updateUser(@RequestBody User newUserData, @PathVariable("id") UUID id) {
		User updatedUser = userService.updateUser(newUserData, id);
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteUser(@PathVariable("id") UUID id) {
	    userService.deleteUser(id);
	    // Responder con 200 OK y un mensaje
	    return ResponseEntity.ok("User id " + id + " successfully deleted");
	}
	

}
