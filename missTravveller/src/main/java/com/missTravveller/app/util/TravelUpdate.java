package com.missTravveller.app.util;

import com.missTravveller.app.model.Travel;


public class TravelUpdate {
	private TravelUpdate() {
		
	}
	public static Travel updateTravel(Travel existingTravel, Travel newTravelData) {
		if (existingTravel == null || newTravelData == null) {
			throw new IllegalArgumentException("Travel data cannot be null");
		}
		
		existingTravel.setDestination(newTravelData.getDestination());
		existingTravel.setPrice(newTravelData.getPrice() );
		existingTravel.setDescription(newTravelData.getDescription());
		existingTravel.setImage(newTravelData.getImage());
		existingTravel.setTraveldate(newTravelData.getTraveldate());
		existingTravel.setQuota(newTravelData.getQuota());


		return existingTravel;
	}
		
	

}
