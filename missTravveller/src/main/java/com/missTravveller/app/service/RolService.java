package com.missTravveller.app.service;

import com.missTravveller.app.model.Rol;

public interface RolService {

	Rol createRol(Rol rol);
	Rol getRolById(Long id);
	Rol getRolByName(String name);
	Rol updateRol(Rol rol, Long id);
	Rol deleteRol
	
	//metodo patch para solo modificar una parte 
	
}
