package com.missTravveller.app.service;


import com.missTravveller.app.model.Rol;

public interface RolService {

	Rol createRol(Rol rol);
	Rol getRolById(Long id);
	Rol getRolByName(String name);
	Rol updateRol(Rol rol, Long id);
	void deleteRol(Long id);
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
