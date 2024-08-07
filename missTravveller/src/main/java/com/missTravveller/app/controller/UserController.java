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

	/**
	 * La anotación @PathVariable en Spring MVC se utiliza para 
	 * extraer valores de la URL de una solicitud HTTP y vincularlos 
	 * a los parámetros de un método de controlador. Esto permite que 
	 * los parámetros dinámicos en la URL se pasen a los métodos del 
	 * controlador, facilitando la creación de rutas RESTful y 
	 * permitiendo la captura de valores específicos directamente 
	 * desde la URL.
	 * 
	 * Los valores dinámicos se definen en la URL de la solicitud 
	 * utilizando llaves {}. Estos valores pueden ser extraídos y 
	 * utilizados en los métodos del controlador.
	 */
	@GetMapping("{id}") // api/v1/users/10
	ResponseEntity<User> getUserById(@PathVariable("id") UUID id) {
		User existingUser = userService.getUserById(id);
		return ResponseEntity.ok(existingUser);
	}

	/**
	 * La anotación @RequestParam en Spring MVC se utiliza para 
	 * extraer parámetros de consulta de una solicitud HTTP y 
	 * vincularlos a los parámetros de un método del controlador. 
	 * Los parámetros de consulta son aquellos que se encuentran 
	 * en la URL después del signo de interrogación ? y suelen 
	 * utilizarse para pasar datos adicionales en las solicitudes GET.
	 * 
	 * 
	 */
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
		return ResponseEntity.status(204).body("User id " + id + " successfully deleted");
	}
	

}
