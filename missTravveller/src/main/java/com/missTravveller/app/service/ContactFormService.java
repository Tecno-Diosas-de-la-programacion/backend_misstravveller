package com.missTravveller.app.service;

import java.util.UUID;

import com.missTravveller.app.model.ContactForm;


public interface ContactFormService {
	
	//Create
	ContactForm createContactForm(ContactForm contactForm);
		
	//Get
	ContactForm getContactFormById(UUID id);
	ContactForm getContactFormByFullName(String fullName);
	ContactForm getContactFormByEmail(String email);
	Iterable<ContactForm> getAllContactForm();
	
	//Delete
	void deleteContactForm(UUID id);
	
}
