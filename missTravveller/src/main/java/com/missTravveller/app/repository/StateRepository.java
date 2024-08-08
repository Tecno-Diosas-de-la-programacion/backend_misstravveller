package com.missTravveller.app.repository;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.missTravveller.app.model.State;

//revisar
@RepositoryRestResource(collectionResourceRel = "states", path = "states")
public interface StateRepository extends CrudRepository<State, Long>, PagingAndSortingRepository<State, Long> {
	
	List<State> findAllByStateName(@Param("value") String stateName);
	boolean existsByName(String name);
	Optional<State>findByName(String name);
}
