package com.missTravveller.app.model;




import jakarta.persistence.*;

@Entity
public class Itinerary {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String activity;
	private Timestamp start_activity;
	private Timestamp end_activity;
	
}
