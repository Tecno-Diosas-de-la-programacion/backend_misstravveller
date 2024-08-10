package com.missTravveller.app.util;

import com.missTravveller.app.model.Itinerary;

public class ItineraryUpdate {
	private ItineraryUpdate() {}
	
	public static Itinerary updateItinerary(Itinerary existingItinerary, Itinerary newItineraryData) {
		if (existingItinerary == null || newItineraryData == null) {
			throw new IllegalArgumentException("Itinerary data cannot be null");
		}
		
		existingItinerary.setActivity(newItineraryData.getActivity());
		existingItinerary.setStartActivity(newItineraryData.getStartActivity() );
		existingItinerary.setEndActivity(newItineraryData.getEndActivity());
		existingItinerary.setMeetingPoint(newItineraryData.getMeetingPoint());
		existingItinerary.setTravel(newItineraryData.getTravel());


		return existingItinerary;
	}
}
