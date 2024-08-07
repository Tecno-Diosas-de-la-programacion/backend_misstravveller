package com.missTravveller.app.service;

import java.math.BigInteger;
import java.security.Timestamp;

import com.missTravveller.app.model.Travel;

public interface TravelService {
	//Create
		Travel createTravel(Travel travel);
		
		//Get
		Travel getTravelById(Long id);
		Travel getTravelByDestination(String destination);
		Travel getTravelByPrice(Double price);
		Travel getTravelByDescription(String description);
		Travel getTravelByImage(Timestamp image);
		Travel getTravelByTraveldate(Timestamp traveldate);
		Travel getTravelByQuota(BigInteger quota);
		
		//Update
		Travel updateTravel(Travel travel, Long id);
		Travel updateTravelByDestination(String destination);
		Travel updateTravelByPrice(Double price);
		Travel updateTravelByDescription(String description);
		Travel updateTravelByImage(Timestamp image);
		Travel updateTravelByTraveldate(Timestamp traveldate);
		Travel updateTravelByQuota(BigInteger quota);
		
		//Delete
		void deleteTravel(Long id);



}
