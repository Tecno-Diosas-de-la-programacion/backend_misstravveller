package com.missTravveller.app.util;

import com.missTravveller.app.model.Itinerary;

public class ItineraryUpdate {
	private ItineraryUpdate() {}
	
	public static Itinerary updateItinerary(Itinerary existingItinerary, Itinerary newItineraryData) {
		if (existingItinerary == null || newItineraryData == null) {
			throw new IllegalArgumentException("Itinerary data cannot be null");
		}
		
		existingItinerary.setActivity(newItineraryData.getActivity());
		existingItinerary.setStart_activity(newItineraryData.getStart_activity() );
		existingItinerary.setEnd_activity(newItineraryData.getEnd_activity());
		existingItinerary.setMeeting_point(newItineraryData.getMeeting_point());
		existingItinerary.setTravel(newItineraryData.getTravel());


		return existingItinerary;
	}
}
