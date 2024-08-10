package com.missTravveller.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.missTravveller.app.model.Itinerary;
import com.missTravveller.app.service.ItineraryService;

@RestController //indica que es controller de API REST
@RequestMapping("api/v1/itineraries") // endpoints
@CrossOrigin(origins = "*") //Permite origenes cruzados, de los puertos. 
public class ItineraryController {

	ItineraryService itineraryService;

	public ItineraryController(ItineraryService itineraryService) {
		this.itineraryService = itineraryService;
	}
	
	@PostMapping
	ResponseEntity<Itinerary> createUser(@RequestBody Itinerary itinerary) {
		Itinerary newItinerary = itineraryService.createItinerary(itinerary);
		return ResponseEntity.status(201).body(newItinerary);
	}

	@GetMapping("{id}")
	ResponseEntity<Itinerary> getItineraryById(@PathVariable Long id) {
		Itinerary existingItinerary = itineraryService.getItineraryById(id);
		return ResponseEntity.ok(existingItinerary);
	}
		
	@PutMapping("{id}")
	ResponseEntity<Itinerary> updateItinerary(@RequestBody Itinerary newItineraryData, @PathVariable Long id) {
		Itinerary updatedItinerary = itineraryService.updateItinerary(newItineraryData, id);
		return ResponseEntity.ok(updatedItinerary);
	}
		
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteItinerary(@PathVariable Long id) {
		itineraryService.deleteItinerary(id);
		return ResponseEntity.status(204).body("Itinerary id " + id + " successfully deleted");
	}
	
}
