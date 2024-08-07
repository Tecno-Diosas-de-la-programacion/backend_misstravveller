package com.missTravveller.app.controller;

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

import com.missTravveller.app.model.Rol;
import com.missTravveller.app.service.RolService;

@RestController //indica que es controller de API REST
@RequestMapping("api/v1/roles") // endpoints
@CrossOrigin(origins = "*") //Permite origenes cruzados, de los puertos.
public class RolController {

	RolService rolService;

	public RolController(RolService rolService) {
		this.rolService = rolService;
	}
	
	
	@PostMapping
	ResponseEntity<Rol> createRol(@RequestBody Rol rol){
		Rol newRol = rolService.createRol(rol);
		return ResponseEntity.status(201).body(newRol);
	}
	
	@GetMapping("{id}")
	ResponseEntity<Rol> getRolById(@PathVariable("id") Long id){
		Rol existingRol = rolService.getRolById(id);
		return ResponseEntity.ok(existingRol);
	}
	
	@GetMapping("{name}")
	ResponseEntity<Rol> getRolByName(@PathVariable("name") String name){
		Rol existingName = rolService.getRolByName(name);
		return ResponseEntity.ok(existingName);
	}
	
	@GetMapping
	ResponseEntity<Iterable<Rol>> getAllRoles(){
		Iterable<Rol> existingRoles = rolService.getAllRoles();
		return ResponseEntity.ok(existingRoles);
	}
	
	@PutMapping("{id}")
	ResponseEntity<Rol> updateRol(@RequestBody Rol newRolData, @PathVariable("id") Long id){
		Rol updateRol = rolService.updateRol(newRolData, id);
		return ResponseEntity.ok(updateRol);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteRol(@PathVariable("id") Long id){
		rolService.deleteRol(id);
		return ResponseEntity.status(204).body("User id" + id + "successfully deleted");
	}
	
	

}
