package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.*;

import com.missTravveller.app.model.Travel;

@RepositoryRestResource(collectionResourceRel = "travels", path = "travels")
public interface TravelsRepository extends CrudRepository<Travel, UUID>, PagingAndSortingRepository<Travel,  UUID> {
	
	List<Travel> findBydestination(String destination);
    List<Travel> findByprice(Double price);
    List<Travel> findBydescription(String description);
    List<Travel> findByimage(Timestamp image);
    List<Travel> findBytraveldate(Timestamp traveldate);
    List<Travel> findByquota(BigInteger quota);
    //List<Travel> findBystatesid(int statesid);
   
    
}



