package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Timestamp;
import java.util.*;

import com.missTravveller.app.model.Itinerary;

@RepositoryRestResource(collectionResourceRel = "itineraries", path = "itineraries")
public interface ItineraryRepository extends CrudRepository<Itinerary, Long>, PagingAndSortingRepository<Itinerary, Long> {
	
	List<Itinerary> findByActivity(String activity);
    List<Itinerary> findByMeetingPoint(String meeting_point);
    List<Itinerary> findByTravel(String travel);
    List<Itinerary> findByStartActivity(Timestamp start_activity);
    List<Itinerary> findByEndActivity(Timestamp end_activity);
    boolean existsByActivity(String activity);
    
}
