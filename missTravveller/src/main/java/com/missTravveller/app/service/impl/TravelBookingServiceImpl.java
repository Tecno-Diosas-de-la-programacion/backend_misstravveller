package com.missTravveller.app.service.impl;

import org.springframework.stereotype.Service;

import com.missTravveller.app.repository.TravelBookingRepository;
import com.missTravveller.app.service.TravelBookingService;

@Service 
public class TravelBookingServiceImpl implements TravelBookingService{

	TravelBookingRepository travelBookingRepository;

	public TravelBookingServiceImpl(TravelBookingRepository travelBookingRepository) {
		this.travelBookingRepository = travelBookingRepository;
	}
	
	
}
