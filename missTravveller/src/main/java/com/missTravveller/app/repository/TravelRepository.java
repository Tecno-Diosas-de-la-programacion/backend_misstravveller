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
	
	List<Travel> findBydestination(String destination);
    List<Travel> findByprice(Double price);
    List<Travel> findBydescription(String description);
    List<Travel> findByimage(Timestamp image);
    List<Travel> findBytraveldate(Timestamp traveldate);
    List<Travel> findByquota(BigInteger quota);
    //List<Travel> findBystatesid(int statesid);
   
    
}



