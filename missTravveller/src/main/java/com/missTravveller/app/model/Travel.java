package com.missTravveller.app.model;

import java.math.BigInteger;
import java.security.Timestamp;
import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="travels")
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
	
	@ManyToMany
	@JoinTable(
			  name = "travel_has_users",        // nombre de la tabla puente
			  joinColumns = @JoinColumn(name = "travel_id"), // nombre del atributo
			  inverseJoinColumns = @JoinColumn(name = "user_id")) // nombre del atributo
	private List<User> users;
	
	  // Relación muchos a uno con State
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
    
	//Constructor vacio SE ESCRIBE
	public Travel() {
		
	}

	public Travel(Long id, String destination, Double price, String description, Timestamp image, Timestamp traveldate,
			BigInteger quota, List<User> users, State state) {
		
		this.id = id;
		this.destination = destination;
		this.price = price;
		this.description = description;
		this.image = image;
		this.traveldate = traveldate;
		this.quota = quota;
		this.users = users;
		this.state = state;
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
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
		builder.append(", users=");
		builder.append(users);
		builder.append(", state=");
		builder.append(state);
		builder.append("]");
		return builder.toString();
	}

	

	// metodo contructor sources>generate contructor using fields> select all
	
	
}


