package com.misstravveller.app.model;

import jakarta.persistence.Entity;

@Entity
public class Usuario {
	
	private Long id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String correoElectronico;
	private String contrasenia;
	private String rol;

}
