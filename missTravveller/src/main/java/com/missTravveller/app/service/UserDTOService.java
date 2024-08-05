package com.missTravveller.app.service;

import java.util.UUID;

import com.missTravveller.app.dto.UserDTO;
import com.missTravveller.app.model.User;
/*Aqui realizamos acciones de acuerdo al modelo de negocio y el CRUD
 * con los atributos del modelo podemos:
 * crear    eliminar    obtener    actualizar  
 */

public interface UserDTOService {

	UserDTO createUser(User user);
	UserDTO getUserById(UUID id);
	UserDTO getUserByEmail(String email);
	Iterable<UserDTO> getAllUser(boolean isActive);
	UserDTO updateUser(User user, UUID id);
	void deleteUser(UUID id);
}
