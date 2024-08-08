package com.missTravveller.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.missTravveller.app.model.Travel;
import com.missTravveller.app.repository.TravelRepository;
import com.missTravveller.app.service.TravelService;
import com.missTravveller.app.util.TravelUpdate;


@Service
public class TravelServiceImpl implements TravelService {
	
	TravelRepository travelRepository;
	

	public TravelServiceImpl(TravelRepository travelRepository) {
		this.travelRepository = travelRepository;
		
	}

	@Override
	public Travel createTravel(Travel travel) {
		String destination = travel.getDestination();
		if( travelRepository.existsByDestination(destination) ) {
			throw new IllegalStateException("The destination " + destination + " is already registered.");
		}
		travel.setId(null);
//		user.setPassword( passwordEncoder.encode( user.getPassword() ));
		Travel newTravel = saveTravel(travel);
		return newTravel;
	}
	
	private Travel saveTravel(Travel travel) {return travelRepository.save(travel);
	}

	@Override
	public Travel getTravelById(Long id) {
		Optional<Travel> optionalTravel = travelRepository.findById(id);
		if( optionalTravel.isEmpty() ) {
			throw new IllegalStateException("Travel does not exist with id " + id);
		}
		return optionalTravel.get();
	}

	@Override
	public Travel getTravelByDestination(String destination) {
		Optional<Travel> optionalTravel = travelRepository.findByDestination(destination);
		if( optionalTravel.isEmpty() ) {
			throw new IllegalStateException("Travel does not exist with destination " + destination);
		}
		return optionalTravel.get();
	}

	@Override
	public Travel getTravelByPrice(Double price) {
		Optional<Travel> optionalTravel = travelRepository.findByPrice(price);
		if( optionalTravel.isEmpty() ) {
			throw new IllegalStateException("Travel does not exist with price " + price);
		}
		return optionalTravel.get();
	}


	@Override
	public Travel updateTravel(Travel travel, Long id) {
		Travel existingTravel = getTravelById(id);
		return TravelUpdate.updateTravel(existingTravel, travel);
		
	}


	@Override
	public void deleteTravel(Long id) {
		Travel existingTravel = getTravelById(id);
		saveTravel(existingTravel);
		
	}
	
}