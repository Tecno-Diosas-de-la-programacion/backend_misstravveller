package com.missTravveller.app.model;

import jakarta.persistence.*;


@Entity
@Table(name="roles")
public class Rol {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name", length=45, nullable=false)
	private String name;
	

	//metodo vacio
	public Rol() {}
	
	

	public Rol(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static Rol setUserRole(Long roleId) {
		return new Rol(  (Long) roleId, "");
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	
}
