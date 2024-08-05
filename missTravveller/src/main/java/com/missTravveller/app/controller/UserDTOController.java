package com.missTravveller.app.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.missTravveller.app.dto.UserDTO;
import com.missTravveller.app.model.User;
import com.missTravveller.app.service.UserDTOService;

@RestController //indica que es controller de API REST
@RequestMapping("api/v1/users") // endpoints
@CrossOrigin(origins = "*") //Permite origenes cruzados, de los puertos. 
public class UserDTOController {

	//llamamos a nuestro servicio 
	UserDTOService userDTOService;
	
	//metodo contructor para generar Bean 
	//sources>generate contructor by fiels

	public UserDTOController(UserDTOService userDTOService) {
		this.userDTOService = userDTOService;
	}
	

	//maping usando todos los metodos de service CRUD
	// return un estatus especifico
	
	
	//crear usuario y devolver 202
	@PostMapping
	ResponseEntity<UserDTO> createUser(@RequestBody User user) {
		UserDTO newUser = userDTOService.createUser(user);
		return ResponseEntity.status(201).body(newUser);
	}

	//buscar usuario por Id
	
	@GetMapping("{id}")
	ResponseEntity<UserDTO> getUserById(@PathVariable UUID id) {
		UserDTO existingUser = userDTOService.getUserById(id);
		return ResponseEntity.ok(existingUser);
	}

	//update actualiza con neUserData y rastrea mediante el Id lo que se va a modificar
	
	@PutMapping("{id}")
	ResponseEntity<UserDTO> updateUser(@RequestBody User newUserData, @PathVariable UUID id) {
		UserDTO updatedUser = userDTOService.updateUser(newUserData, id);
		return ResponseEntity.ok(updatedUser);
	}
	
	//ratreamos lo que se va a borrar con Id
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteUser(@PathVariable UUID id) {
		userDTOService.deleteUser(id);
		return ResponseEntity.status(204).body("User id " + id + " successfully deleted");
	}

	
	
	
}
