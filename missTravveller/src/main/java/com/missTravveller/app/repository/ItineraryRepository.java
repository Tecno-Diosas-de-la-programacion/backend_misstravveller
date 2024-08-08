package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Timestamp;
import java.util.*;

import com.missTravveller.app.model.Itinerary;

@RepositoryRestResource(collectionResourceRel = "itineraries", path = "itineraries")
public interface ItineraryRepository extends CrudRepository<Itinerary, Long>, PagingAndSortingRepository<Itinerary, Long> {
	
	Optional<Itinerary> findByActivity(String activity);
    Optional<Itinerary> findByMeetingPoint(String meeting_point);
    Optional<Itinerary> findByStartActivity(Timestamp start_activity);
    Optional<Itinerary> findByEndActivity(Timestamp end_activity);
    boolean existsByActivity(String activity);
    
}
