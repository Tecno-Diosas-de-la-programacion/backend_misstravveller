package com.missTravveller.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.missTravveller.app.model.TravelBooking;
import com.missTravveller.app.model.composite_key.UserTravelKey;

public interface TravelBookingRepository extends CrudRepository< TravelBooking, UserTravelKey>{
	

	List<TravelBooking> findAllByTravelId(Long travelId );
}
