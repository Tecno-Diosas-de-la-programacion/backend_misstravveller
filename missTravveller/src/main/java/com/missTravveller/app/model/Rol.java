package com.missTravveller.app.model;

import java.util.UUID;

import jakarta.persistence.*;


@Entity
@Table(name="roles")
public class Rol {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(name="name", length=45, nullable=false)
	private String name;
	

	//metodo vacio
	public Rol() {}
	
	

	public Rol(UUID id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static Rol setUserRole(UUID roleId) {
		return new Rol(  (UUID) roleId, "");
	}



	public UUID getId() {
		return id;
	}



	public void setId(UUID id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	
}
