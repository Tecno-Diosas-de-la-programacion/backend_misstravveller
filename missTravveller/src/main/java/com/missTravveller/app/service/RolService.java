package com.missTravveller.app.service;


import java.util.UUID;

import com.missTravveller.app.model.Rol;

public interface RolService {

	Rol createRol(Rol rol);
	Rol getRolById(UUID id);
	Rol getRolByName(String name);
	Rol updateRol(Rol rol, UUID id);
	void deleteRol(UUID id);
	Iterable<Rol> getAllRoles();
	
	//metodo patch para solo modificar una parte 
	
	/*
	 * else if para evaluar null
	 * 	
	itinerarypatch = newitineraryDate
	se evalua lo que voy a enviar
	 */
	
	/*
	 * path paramethers
	 * tambien lleva if-else
	 */

}
