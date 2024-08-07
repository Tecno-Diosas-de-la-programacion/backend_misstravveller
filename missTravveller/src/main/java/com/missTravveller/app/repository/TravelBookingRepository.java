package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.*;

import com.missTravveller.app.model.TravelBooking;


@RepositoryRestResource(collectionResourceRel = "travelBooking", path = "travelBooking")
public interface TravelBookingRepository extends CrudRepository<TravelBooking, UUID>, PagingAndSortingRepository<TravelBooking, UUID> {

List<TravelBooking> findByTravelBooking(UUID id);



}