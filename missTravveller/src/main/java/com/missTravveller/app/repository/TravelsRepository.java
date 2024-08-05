package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.*;

import com.missTravveller.app.model.Travels;

@RepositoryRestResource(collectionResourceRel = "travels", path = "travels")
public interface TravelsRepository extends CrudRepository<Travels, UUID>, PagingAndSortingRepository<Travels,  UUID> {
	
	List<Travels> findBydestination(String destination);
    List<Travels> findByprice(Double price);
    List<Travels> findBydescription(String description);
    List<Travels> findByimage(Timestamp image);
    List<Travels> findBytraveldate(Timestamp traveldate);
    List<Travels> findByquota(BigInteger quota);
    List<Travels> findBystatesid(int statesid);
   
    
}



