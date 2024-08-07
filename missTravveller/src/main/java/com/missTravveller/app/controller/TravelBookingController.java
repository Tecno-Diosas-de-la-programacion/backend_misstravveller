package com.missTravveller.app.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.missTravveller.app.model.TravelBooking;
import com.missTravveller.app.service.TravelBookingService;

@RestController //indica que es controller de API REST
@RequestMapping("api/v1/travelBooking") // endpoints
@CrossOrigin(origins = "*") //Permite origenes cruzados, de los puertos. 

public class TravelBookingController {
	
	TravelBookingService travelBookingService;

	public TravelBookingController(TravelBookingService travelBookingService) {
		this.travelBookingService = travelBookingService;
	}
	
	@PostMapping
	ResponseEntity<TravelBooking> createTravelBooking(@RequestBody TravelBooking travelBooking) {
		TravelBooking newTravelBooking = travelBookingService.createTravelBooking(travelBooking);
		return ResponseEntity.status(201).body(newTravelBooking);
	}

	@GetMapping("{id}")
	ResponseEntity<TravelBooking> getTravelBookingById(@PathVariable UUID id) {
		TravelBooking existingTravelBooking = travelBookingService.getTravelBookingById(id);
		return ResponseEntity.ok(existingTravelBooking);
	}
		
		
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteTravelBooking(@PathVariable UUID id) {
		travelBookingService.deleteTravelBooking(id);
		return ResponseEntity.status(204).body("Travel Booking id " + id + " successfully deleted");
	}

}
