package com.missTravveller.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.missTravveller.app.model.State;
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
	ResponseEntity<State>createStates(@RequestBody State states){
		State newStates = stateService.createStates(states);
		return ResponseEntity.status(201).body(newStates);
	}
	
	@GetMapping("{id}")
	ResponseEntity<State>getStatesById(@PathVariable Long id){
		State existingStates = stateService.getStatesById(id);
		return ResponseEntity.ok(existingStates);		
	}
	
	@PutMapping("{id}")
	ResponseEntity<State>updateStates(@RequestBody State newStatesData, @PathVariable Long id){
		State updateStates = stateService.updateStates(newStatesData, id);
		return ResponseEntity.ok(updateStates);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String>deleteStates(@PathVariable Long id){
		stateService.deleteStates(id);
		return ResponseEntity.status(204).body("State id " + id + " successfully deleted");
	}
	
	
}
