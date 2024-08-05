package com.missTravveller.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.missTravveller.app.model.ContactForm;

@RepositoryRestResource(collectionResourceRel = "contact_forms", path = "contact_forms")
public interface ContactFormRepository extends CrudRepository<ContactForm, Long> {
	
	Iterable<ContactForm> findByEmail(String email);
    Iterable<ContactForm> findByFullName(String full_name);
    Iterable<ContactForm> findByPhone(String phone);
    boolean existsByEmail(String email);
}
