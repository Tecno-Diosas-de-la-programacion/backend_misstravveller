package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.*;

import com.missTravveller.app.model.Travel;

@RepositoryRestResource(collectionResourceRel = "travel", path = "travel")
public interface TravelRepository extends CrudRepository<Travel, Long>, PagingAndSortingRepository<Travel, Long> {
	
	Optional<Travel> findByDestination(String destination);
	Optional<Travel> findByPrice(Double price);
//	Optional<Travel> findByTravelDate(Timestamp traveldate);
    //List<Travel> findBystatesid(int statesid);
   
    boolean existsByDestination(String destination);
    
}



