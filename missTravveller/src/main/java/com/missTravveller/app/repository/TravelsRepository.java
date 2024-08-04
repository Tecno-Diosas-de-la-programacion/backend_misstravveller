package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;

import com.missTravveller.app.model.Travels;

public interface TravelsRepository extends CrudRepository<Travels, UUID>, PagingAndSortingRepository<Travels, UUID> {

	//revisar 
	
	Optional<Travels> findByEmail(String email);	
	Iterable<Travels> findAllByActiveTrue();
	Iterable<Travels> findAllByActiveFalse();
	boolean existsByEmail(String email);
	
}

