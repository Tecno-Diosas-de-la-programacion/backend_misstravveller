package com.missTravveller.app.model;

import java.math.BigInteger;
import java.security.Timestamp;
import java.util.UUID;

import jakarta.persistence.*;


@Entity
@Table(name="Travels")
public class Travels {

	//SE ESCRIBE 
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(name = "number", length = 45, nullable =false)
	private String destination;
	@Column(name = "destination", length = 100, nullable =false)
	private Double price;
	@Column(name = "price", length = 45, nullable =false)
	private String description;
	@Column(name = "description", length = 100, nullable =false, unique=true)
	private Timestamp image;
	@Column(name = "image", length = 12, nullable =false)
	private Timestamp traveldate;
	@Column(name = "traveldate", length = 12, nullable =false)
	private BigInteger quota;
	//@Column(name = "quota", length = 100, nullable =false, unique=true)
	//relacion many to one stateid
	
	
	//Constructor vacio SE ESCRIBE
	public Travels() {
		
	}

	// metodo contructor sources>generate contructor using fields> select all
	public Travels(UUID id, String destination, Double price, String description, Timestamp image, Timestamp traveldate,
			BigInteger quota, int statesid) {
		super();
		this.id = id;
		this.destination = destination;
		this.price = price;
		this.description = description;
		this.image = image;
		this.traveldate = traveldate;
		this.quota = quota;
		//this.statesid = statesid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Travels [id=");
		builder.append(id);
		builder.append(", destination=");
		builder.append(destination);
		builder.append(", price=");
		builder.append(price);
		builder.append(", description=");
		builder.append(description);
		builder.append(", image=");
		builder.append(image);
		builder.append(", traveldate=");
		builder.append(traveldate);
		builder.append(", quota=");
		builder.append(quota);
		//builder.append(", statesid=");
		//builder.append(statesid);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}


