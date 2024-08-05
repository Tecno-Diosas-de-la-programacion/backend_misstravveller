package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

import com.missTravveller.app.model.User;



public interface UserRepository extends CrudRepository<User, UUID>, PagingAndSortingRepository<User, UUID> {

	//revisar 
	
	Optional<User> findByEmail(@Param("email") String email);	
	Iterable<User> findByEmailContaining(@Param("email") String email);	
	boolean existsByEmail(@Param("email") String email);
	
}


