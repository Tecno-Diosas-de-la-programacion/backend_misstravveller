package com.missTravveller.app.model;

import java.util.UUID;

import jakarta.persistence.*;


@Entity
@Table(name="contact_forms")
public class ContactForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String full_name;
	private String email;
	private String phone;
	private String comments;
	
	public ContactForm() {
		
	}

	public ContactForm(UUID id, String full_name, String email, String phone, String comments) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.email = email;
		this.phone = phone;
		this.comments = comments;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContactForm [id=");
		builder.append(id);
		builder.append(", full_name=");
		builder.append(full_name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", comments=");
		builder.append(comments);
		builder.append("]");
		return builder.toString();
	}

	
	
}
