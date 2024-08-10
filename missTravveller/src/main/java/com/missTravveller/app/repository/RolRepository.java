package com.missTravveller.app.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.missTravveller.app.model.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, UUID> {

	//	opciones
	
//vacio 
//	Optional<Rol> findByUser(User user);
//	void deleteByUser(Rol );
	
	
}
