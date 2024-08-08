package com.missTravveller.app.service;

import com.missTravveller.app.model.Itinerary;

public interface ItineraryService {
	//Create
	Itinerary createItinerary(Itinerary itinerary);
	
	//Get
	Itinerary getItineraryById(Long id);
	Itinerary getItineraryByActivity(String activity);
	Itinerary getItineraryByMeetingPoint(String meetingPoint);
	
	//Update
	Itinerary updateItinerary(Itinerary itinerary, Long id);
	/*Itinerary updateActivity(Itinerary activity, Long id);
	Itinerary updateStartActivity(Itinerary start_activity, Long id);
	Itinerary updateEndActivity(Itinerary end_activity, Long id);
	Itinerary updateMeetingPoint(Itinerary meeting_point, Long id);*/
	
	//Delete
	void deleteItinerary(Long id);
	
}
