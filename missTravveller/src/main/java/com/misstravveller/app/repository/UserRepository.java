package com.misstravveller.app.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.misstravveller.app.model.Usuario;

public interface UserRepository extends CrudRepository<Usuario, UUID> {

}
