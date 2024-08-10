package com.missTravveller.app.service.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.missTravveller.app.model.Itinerary;
import com.missTravveller.app.repository.ItineraryRepository;
import com.missTravveller.app.service.ItineraryService;
import com.missTravveller.app.util.ItineraryUpdate;

@Service
public class ItineraryServiceImpl implements ItineraryService {
	
	ItineraryRepository itineraryRepository;
	
	
	public ItineraryServiceImpl(ItineraryRepository itineraryRepository) {
		this.itineraryRepository = itineraryRepository;
		
	}

	@Override
	public Itinerary createItinerary(Itinerary itinerary) {
		String activity = itinerary.getActivity();
		if(itineraryRepository.existsByActivity(activity)) {
			throw new IllegalStateException("The activity " + activity + " is already registered.");
		}
		itinerary.setId(null);
//		user.setPassword( passwordEncoder.encode( user.getPassword() ));
		Itinerary newItinerary = saveItinerary(itinerary);
		return newItinerary;
	}
	
	private Itinerary saveItinerary(Itinerary itinerary) {
		return itineraryRepository.save(itinerary);
	}

	@Override
	public Itinerary getItineraryById(Long id) {
		Optional<Itinerary> optionalItinerary = itineraryRepository.findById(id);
		if( optionalItinerary.isEmpty() ) {
			throw new IllegalStateException("Itinerary does not exist with id " + id);
		}
		return optionalItinerary.get();
	}

	@Override
	public Itinerary getItineraryByActivity(String activity) {
		Optional<Itinerary> optionalItinerary = itineraryRepository.findByActivity(activity);
		if( optionalItinerary.isEmpty() ) {
			throw new IllegalStateException("Itinerary does not exist with activity " + activity);
		}
		return optionalItinerary.get();
	}

	@Override
	public Itinerary getItineraryByMeetingPoint(String meetingPoint) {
		Optional<Itinerary> optionalItinerary = itineraryRepository.findByMeetingPoint(meetingPoint);
		if( optionalItinerary.isEmpty() ) {
			throw new IllegalStateException("Itinerary does not exist with meeting point " + meetingPoint);
		}
		return optionalItinerary.get();
	}

	@Override
	public Itinerary updateItinerary(Itinerary itinerary, Long id) {
		Itinerary existingItinerary = getItineraryById(id);
		return ItineraryUpdate.updateItinerary(existingItinerary, itinerary);
	}

	@Override
	public void deleteItinerary(Long id) {
		Itinerary existingItinerary = getItineraryById(id);
		saveItinerary(existingItinerary);
		
	}

}
