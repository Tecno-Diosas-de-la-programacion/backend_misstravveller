package com.missTravveller.app.repository;

import java.util.*;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import com.missTravveller.app.model.States;

//revisar
public interface StatesRespository extends CrudRepository<States, UUID>, PagingAndSortingRepository<States, UUID> {
	
	List<States> findAllByStateName(@Param("value") String stateName);

}
