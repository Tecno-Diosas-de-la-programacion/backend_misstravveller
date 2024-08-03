package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;

import com.missTravveller.app.model.User;

public interface UserRepository extends CrudRepository<User, UUID>, PagingAndSortingRepository<User, UUID> {

	//revisar 
	
	Optional<User> findByEmail(String email);	
	Iterable<User> findAllByActiveTrue();
	Iterable<User> findAllByActiveFalse();
	boolean existsByEmail(String email);
	
	
}


