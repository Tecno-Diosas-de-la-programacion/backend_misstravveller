package com.missTravveller.app.repository;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import com.missTravveller.app.model.State;

//revisar
public interface StatesRepository extends CrudRepository<State, Long>, PagingAndSortingRepository<State, Long> {
	
	List<State> findAllByStateName(@Param("value") String stateName);

}
