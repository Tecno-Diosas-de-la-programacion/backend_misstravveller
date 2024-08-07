package com.missTravveller.app.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="travelBooking")
public class TravelBooking { 
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	public TravelBooking() {
		
	}

	public TravelBooking(UUID id) {
		super();
		this.id = id;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TravelBooking [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	} 
	
	
}
// TRABAJAR LA RELACION ENTRE TABLAS 