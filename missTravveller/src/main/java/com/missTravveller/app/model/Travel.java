package com.missTravveller.app.model;

import java.math.BigInteger;
import java.security.Timestamp;

import jakarta.persistence.*;


@Entity
@Table(name="travel")
public class Travel {

	//SE ESCRIBE 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "destination", length = 45, nullable =false)
	private String destination;
	@Column(name = "price", length = 100, nullable =false)
	private Double price;
	@Column(name = "description", length = 45, nullable =false)
	private String description;
	@Column(name = "image", length = 100, nullable =false, unique=true)
	private Timestamp image;
	@Column(name = "traveldate", length = 12, nullable =false)
	private Timestamp traveldate;
	@Column(name = "quota", length = 12, nullable =false)
	private BigInteger quota;
	//@Column(name = "quota", length = 100, nullable =false, unique=true)
	//private int statesid;
	
	
	//Constructor vacio SE ESCRIBE
	public Travel() {
		
	}
	public Travel(Long id, String destination, Double price, String description, Timestamp image, Timestamp traveldate,
			BigInteger quota) {
		super();
		this.id = id;
		this.destination = destination;
		this.price = price;
		this.description = description;
		this.image = image;
		this.traveldate = traveldate;
		this.quota = quota;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getImage() {
		return image;
	}
	public void setImage(Timestamp image) {
		this.image = image;
	}
	public Timestamp getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(Timestamp traveldate) {
		this.traveldate = traveldate;
	}
	public BigInteger getQuota() {
		return quota;
	}
	public void setQuota(BigInteger quota) {
		this.quota = quota;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Travel [id=");
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
		builder.append("]");
		return builder.toString();
	}

	// metodo contructor sources>generate contructor using fields> select all
	
	
}


