package com.missTravveller.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.missTravveller.app.model.States;
import com.missTravveller.app.service.StateService;


@RestController
@RequestMapping("api/v1/states") // endpoints
@CrossOrigin(origins = "*")  
public class StateController {

	StateService stateService;

	public StateController(StateService stateService) {
		this.stateService = stateService;
	}
	
	@PostMapping
	ResponseEntity<States>createStates(@RequestBody States states){
		States newStates = stateService.createStates(states);
		return ResponseEntity.status(201).body(newStates);
	}
	
	@GetMapping("{id}")
	ResponseEntity<States>getStatesById(@PathVariable Long id){
		States existingStates = stateService.getStatesById(id);
		return ResponseEntity.ok(existingStates);		
	}
	
	@PutMapping("{id}")
	ResponseEntity<States>updateStates(@RequestBody States newStatesData, @PathVariable Long id){
		States updateStates = stateService.updateStates(newStatesData, id);
		return ResponseEntity.ok(updateStates);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String>deleteStates(@PathVariable Long id){
		stateService.deleteStates(id);
		return ResponseEntity.status(204).body("State id " + id + " successfully deleted");
	}
	
	
}
