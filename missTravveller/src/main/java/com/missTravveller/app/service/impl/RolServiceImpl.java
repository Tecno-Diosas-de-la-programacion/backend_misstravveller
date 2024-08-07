package com.missTravveller.app.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.missTravveller.app.model.Rol;
import com.missTravveller.app.repository.RolRepository;
import com.missTravveller.app.service.RolService;

//1  indicamos que es un servicio
//2  implementamos la interfaz 
@Service
public class RolServiceImpl implements RolService {

	//3 picamos el error y ponemos add unimplement methods
	/*
	 * 4 modificar los returns y logica de los metodos
	 * para esto me guie de ejemplos del repo de serch y los que les
	 * inserte en whats de proyectos. 
	 * 
	 */
	
	//5 siempre nuestro atributo sera el repo
	
	RolRepository rolRepository;
	 
	//6 nuestro metodo contructor  recuerden quitar super()
	public RolServiceImpl(RolRepository rolRepository) {
		this.rolRepository = rolRepository;
	}

	
	
	@Override
	public Rol createRol(Rol rol) {
		return rolRepository.save(rol);
	}

	@Override
	public Rol getRolById(UUID id) {
		return rolRepository.findById(id)
				.orElseThrow( ()-> new IllegalStateException("Role does not exist with id " + id));
	}

	@Override
	public Rol getRolByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol updateRol(Rol rol, UUID id) {
		Rol existingRol = getRolById(id);
		existingRol.setName( rol.getName() );
		return rolRepository.save(existingRol);
	}

	@Override
	public void deleteRol(UUID id) {
		// TODO Auto-generated method stub
		//no retorna nada
	}

	@Override
	public Iterable<Rol> getAllRoles() {
		return rolRepository.findAll();
	}

}
