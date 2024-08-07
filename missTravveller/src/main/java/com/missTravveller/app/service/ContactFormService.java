package com.missTravveller.app.service;

import java.util.UUID;

import com.missTravveller.app.model.ContactForm;

public interface ContactFormService {
	
	//Create
	ContactForm createContactForm(ContactForm contactForm);
		
	//Get
	ContactForm getContactFormById(UUID id);
	ContactForm getContactFormByFullName(String full_name);
	ContactForm getContactFormByEmail(String email);
	
	//Delete
	void deleteContactForm(UUID id);
	
}
