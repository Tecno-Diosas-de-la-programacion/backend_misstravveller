package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.missTravveller.app.model.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {

}
