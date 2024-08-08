package com.missTravveller.app.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.missTravveller.app.model.ContactForm;

@RepositoryRestResource(collectionResourceRel = "contact_forms", path = "contact_forms")
public interface ContactFormRepository extends CrudRepository<ContactForm, UUID> {
	
	Optional<ContactForm> findByEmail(String email);
    Optional<ContactForm> findByFullName(String fullName);
    Optional<ContactForm> findByPhone(String phone);
    boolean existsByEmail(String email);
}
