package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.*;

import com.missTravveller.app.model.Travel;

@RepositoryRestResource(collectionResourceRel = "travel", path = "travel")
public interface TravelRepository extends CrudRepository<Travel, Long>, PagingAndSortingRepository<Travel, Long> {
	
	Optional<Travel> findBydestination(String destination);
	Optional<Travel> findByprice(Double price);
	Optional<Travel> findBydescription(String description);
	Optional<Travel> findByimage(Timestamp image);
	Optional<Travel> findBytraveldate(Timestamp traveldate);
	Optional<Travel> findByquota(BigInteger quota);
    //List<Travel> findBystatesid(int statesid);
   
    boolean existsByDestination(String destination);
    
}



