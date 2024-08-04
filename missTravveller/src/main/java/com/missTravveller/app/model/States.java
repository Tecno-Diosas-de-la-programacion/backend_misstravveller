package com.missTravveller.app.model;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name="states")
public class States {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(name = "state_name", length = 100, nullable =false)
	private String stateName;
	
	//constructor
	public States() {
		
	}
	
	//constructor using fields
	public States(UUID id, String nombre) {
		super();
		this.id = id;
		this.stateName = nombre;
	}
	
	//setters and getters
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNombre() {
		return stateName;
	}

	public void setNombre(String nombre) {
		this.stateName = nombre;
	}
	
	//String
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("States [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(stateName);
		builder.append("]");
		return builder.toString();
	}
	
	//Relacion con Tabla Travels
	
	
	

}
