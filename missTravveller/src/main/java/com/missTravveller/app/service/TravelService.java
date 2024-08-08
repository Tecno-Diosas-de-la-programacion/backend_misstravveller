package com.missTravveller.app.service;



import com.missTravveller.app.model.Travel;

public interface TravelService {
	//Create
		Travel createTravel(Travel travel);
		
		//Get
		Travel getTravelById(Long id);
		Travel getTravelByDestination(String destination);
		Travel getTravelByPrice(Double price);
		
		
		//Update
		Travel updateTravel(Travel newTravelData, Long id);
		
		//Delete
		void deleteTravel(Long id);

		

		



}
