package com.misstravveller.app.service;

import java.util.UUID;

import com.misstravveller.app.model.Usuario;

public interface UserService {
	
	Usuario getUserById(UUID id);
	Usuario getUserByEmail(String correoElectronico);
	
	Iterable<Usuario> getAllActiveUser();
	Usuario updateUser(Usuario usuario, UUID id);
	
	void deleteUser(UUID id);
	

}
