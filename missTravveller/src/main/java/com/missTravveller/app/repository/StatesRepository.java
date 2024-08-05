package com.missTravveller.app.repository;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import com.missTravveller.app.model.States;

//revisar
public interface StatesRepository extends CrudRepository<States, Long>, PagingAndSortingRepository<States, Long> {
	
	List<States> findAllByStateName(@Param("value") String stateName);

}
