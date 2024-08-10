package com.missTravveller.app.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.missTravveller.app.model.ContactForm;

import com.missTravveller.app.service.ContactFormService;

@RestController //indica que es controller de API REST
@RequestMapping("api/v1/contact_forms") // endpoints
@CrossOrigin(origins = "*") //Permite origenes cruzados, de los puertos. 
public class ContactFormController {
	
	ContactFormService contactFormService;

	public ContactFormController(ContactFormService contactFormService) {
		this.contactFormService = contactFormService;
	}

	@PostMapping
	ResponseEntity<ContactForm> createContactForm(@RequestBody ContactForm contactForm) {
		ContactForm newContactForm = contactFormService.createContactForm(contactForm);
		return ResponseEntity.status(201).body(newContactForm);
	}

	@GetMapping
	ResponseEntity<Iterable<ContactForm>> getAllContactForm() {
		Iterable<ContactForm> existingCF = contactFormService. getAllContactForm();
		return ResponseEntity.ok(existingCF);
	}

   

	@GetMapping("{id}")
	ResponseEntity<ContactForm> getContactFormById(@PathVariable("id") UUID id) {
		ContactForm existingContactForm = contactFormService.getContactFormById(id);
		return ResponseEntity.ok(existingContactForm);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteContactForm(@PathVariable("id") UUID id) {
		contactFormService.deleteContactForm(id);
		return ResponseEntity.status(204).body("ContactForm id " + id + " successfully deleted");
	}
}
