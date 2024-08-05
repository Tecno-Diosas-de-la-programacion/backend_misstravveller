package com.missTravveller.app.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;


@Entity
@Table(name="users")
public class User {

	//SE ESCRIBE 
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(name = "name", length = 45, nullable =false)
	private String name;
	@Column(name = "fatherLastName", length = 45, nullable =false)
	private String fatherLastName;
	@Column(name = "motherLastName", length = 45, nullable =false)
	private String motherLastName;
	@Column(name = "email", length = 45, nullable =false, unique=true)
	private String email;
	@Column(name = "password", length = 100, nullable =false)
	private String password;
	
	
	@ManyToMany
	@JoinTable(
			  name = "user_has_roles",        // nombre de la tabla puente
			  joinColumns = @JoinColumn(name = "user_id"), // nombre del atributo
			  inverseJoinColumns = @JoinColumn(name = "role_id")) // nombre del atributo
	private List<Rol> roles;
	
	//Constructor vacio SE ESCRIBE
	public User() {
		
	}
	// metodo contructor sources>generate contructor using fields> select all
	
	public User(UUID id, String name, String fatherLastName, String motherLastName, String email, String password, List<Rol> roles) {
		super();
		this.id = id;
		this.name = name;
		this.fatherLastName = fatherLastName;
		this.motherLastName = motherLastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	
	//stters y getters

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

	public String getFatherLastName() {
		return fatherLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	//generar con el buffer

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", fatherLastName=");
		builder.append(fatherLastName);
		builder.append(", motherLastName=");
		builder.append(motherLastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", roles=");
		builder.append(roles);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
