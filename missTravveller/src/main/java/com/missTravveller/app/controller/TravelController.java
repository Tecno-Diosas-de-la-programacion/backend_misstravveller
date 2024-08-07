package com.missTravveller.app.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.missTravveller.app.model.Travel;
import com.missTravveller.app.service.TravelService;

@RestController //indica que es controller de API REST
@RequestMapping("api/v1/travel") // endpoints
@CrossOrigin(origins = "*") //Permite origenes cruzados, de los puertos. 
public class TravelController {
	
	TravelService travelService;

	public TravelController(TravelService travelService) {
		this.travelService = travelService;
	}
	
	@PostMapping
	ResponseEntity<Travel> createTravel(@RequestBody Travel travel) {
		Travel newTravel = travelService.createTravel(travel);
		return ResponseEntity.status(201).body(newTravel);
	}

	@GetMapping("{id}")
	ResponseEntity<Travel> getTravelById(@PathVariable Long id) {
		Travel existingTravel = travelService.getTravelById(id);
		return ResponseEntity.ok(existingTravel);
	}
		
	@PutMapping("{id}")
	ResponseEntity<Travel> updateTravel(@RequestBody Travel newTravelData, @PathVariable Long id) {
		Travel updatedTravel = travelService.updateTravel(newTravelData, id);
		return ResponseEntity.ok(updatedTravel);
	}
		
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteTravel(@PathVariable Long id) {
		travelService.deleteTravel(id);
		return ResponseEntity.status(204).body("Travel id " + id + " successfully deleted");
	}

}
