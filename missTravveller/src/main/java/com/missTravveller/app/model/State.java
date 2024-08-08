package com.missTravveller.app.model;


import jakarta.persistence.*;

@Entity
@Table(name="states")
public class State {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "stateName", length = 100, nullable =false)
	private String stateName;
	
	//constructor
	public State() {
		
	}
	
	//constructor using fields
	public State(Long id, String stateName) {
		this.id = id;
		this.stateName = stateName;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("State [id=");
		builder.append(id);
		builder.append(", stateName=");
		builder.append(stateName);
		builder.append("]");
		return builder.toString();
	}

	//Relacion con Tabla Travels
//	@OneToMany
//    @JoinColumn(name = "travel_id", nullable = false)
//    private Set<Travel> travel;
	
	

}
