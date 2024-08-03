package com.missTravveller.app.model;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(name = "name", length = 45, nullable =false)
	private String nombre;
	@Column(name = "apellido_paterno", length = 45, nullable =false)
	private String apellidoPaterno;
	@Column(name = "apellido_materno", length = 45, nullable =false)
	private String apellidoMaterno;
	@Column(name = "correo_electronico", length = 45, nullable =false, unique=true)
	private String correoElectronico;
	@Column(name = "contrasena", length = 100, nullable =false)
	private String contrasena;
	@Column(name = "rol", length = 20, nullable =false)
	private String rol;
	
	public User() {
		
	}
	
	public User(UUID id, String nombre, String apellidoPaterno, String apellidoMaterno, String correoElectronico,
			String contrasena, String rol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.correoElectronico = correoElectronico;
		this.contrasena = contrasena;
		this.rol = rol;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidoPaterno=");
		builder.append(apellidoPaterno);
		builder.append(", apellidoMaterno=");
		builder.append(apellidoMaterno);
		builder.append(", correoElectronico=");
		builder.append(correoElectronico);
		builder.append(", contrasena=");
		builder.append(contrasena);
		builder.append(", rol=");
		builder.append(rol);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
