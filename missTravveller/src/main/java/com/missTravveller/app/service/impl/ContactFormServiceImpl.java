package com.missTravveller.app.service.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.missTravveller.app.model.ContactForm;

import com.missTravveller.app.repository.ContactFormRepository;
import com.missTravveller.app.service.ContactFormService;

@Service
public class ContactFormServiceImpl implements ContactFormService{

	ContactFormRepository contactFormRepository;
	
	
	public ContactFormServiceImpl(ContactFormRepository contactFormRepository) {
		this.contactFormRepository = contactFormRepository;
		
	}

	@Override
	public ContactForm createContactForm(ContactForm contactForm) {
		String email = contactForm.getEmail();
		if( contactFormRepository.existsByEmail(email) ) {
			throw new IllegalStateException("The email " + email + " is already registered.");
		}
		contactForm.setId(null);
		ContactForm newContactForm = saveContactForm(contactForm);
		return newContactForm;
	}
	
	private ContactForm saveContactForm(ContactForm contactForm) {
		return contactFormRepository.save(contactForm);
	}

	@Override
	public ContactForm getContactFormById(UUID id) {
		Optional<ContactForm> optionalContactForm = contactFormRepository.findById(id);
		if( optionalContactForm.isEmpty() ) {
			throw new IllegalStateException("Contact form does not exist with id " + id);
		}
		return optionalContactForm.get();
	}

	@Override
	public ContactForm getContactFormByFullName(String fullName) {
		Optional<ContactForm> optionalContactForm = contactFormRepository.findByFullName(fullName);
		if( optionalContactForm.isEmpty() ) {
			throw new IllegalStateException("Contact form does not exist with full name " + fullName);
		}
		return optionalContactForm.get();
	}

	@Override
	public ContactForm getContactFormByEmail(String email) {
		Optional<ContactForm> optionalContactForm = contactFormRepository.findByEmail(email);
		if( optionalContactForm.isEmpty() ) {
			throw new IllegalStateException("Contact form does not exist with email " + email);
		}
		return optionalContactForm.get();
	}

	@Override
	public void deleteContactForm(UUID id) {
		ContactForm existingContactForm = getContactFormById(id);
		saveContactForm(existingContactForm);
	}
	
	@Override
    public Iterable<ContactForm> getAllContactForm() {
        return contactFormRepository.findAll();  // Llama a findAll() en la instancia del repositorio
    }

}
