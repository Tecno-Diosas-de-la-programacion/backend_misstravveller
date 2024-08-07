package com.missTravveller.app.service;

import java.util.UUID;

import com.missTravveller.app.model.TravelBooking;

public interface TravelBookingService {
	
	//Create
			TravelBooking createTravelBooking(TravelBooking travelBooking);
			
			//Get
			TravelBooking getTravelBookingById(UUID id);
			
			
			//Update
			
			
			//Delete
			void deleteTravelBooking(UUID id);



}
