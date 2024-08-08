package com.missTravveller.app.model;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="states")
public class State {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "state_name", length = 100, nullable =false)
	private String stateName;
	
	//constructor
	public State() {
		
	}
	
	//constructor using fields
	public State(Long id, String name) {
		super();
		this.id = id;
		this.stateName = name;
	}
	
	//setters and getters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return stateName;
	}

	public void setName(String name) {
		this.stateName = name;
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
//	@OneToMany
//    @JoinColumn(name = "travel_id", nullable = false)
//    private Set<Travel> travel;
	
	

}
