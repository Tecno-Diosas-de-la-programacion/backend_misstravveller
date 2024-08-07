package com.missTravveller.app.service;

import java.util.List;
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
	UserDTO updateUser(User user, UUID id);
	void deleteUser(UUID id);
	User findByEmailAndPassword(String email ,String password); // PREGUNTAR SI SE PUEDE PORQUE EN DTO NO USAS CONTRASEÑA 
	List<UserDTO> getAllUsers();
}
