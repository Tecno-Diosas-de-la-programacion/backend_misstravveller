package com.missTravveller.app.model;



import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="states")
public class State {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "stateName", length = 100, nullable =false)
	private String stateName;
	
	// Relación uno a muchos con Travel
    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Travel> travels;
    
	//constructor
	public State() {
		
	}

	public State(Long id, String stateName, Set<Travel> travels) {
		this.id = id;
		this.stateName = stateName;
		this.travels = travels;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Set<Travel> getTravels() {
		return travels;
	}

	public void setTravels(Set<Travel> travels) {
		this.travels = travels;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("State [id=");
		builder.append(id);
		builder.append(", stateName=");
		builder.append(stateName);
		builder.append(", travels=");
		builder.append(travels);
		builder.append("]");
		return builder.toString();
	}
	
	
	//constructor using fields
	

	//Relacion con Tabla Travels
//	@OneToMany
//    @JoinColumn(name = "travel_id", nullable = false)
//    private Set<Travel> travel;
	
	

}
