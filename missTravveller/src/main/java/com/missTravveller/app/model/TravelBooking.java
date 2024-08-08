package com.missTravveller.app.model;

import java.io.Serializable;
import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.missTravveller.app.model.composite_key.UserTravelKey;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table (name="travelBooking")
public class TravelBooking implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UserTravelKey id;
	

	@ManyToOne
	@MapsId("travelId")
    @JoinColumn(name = "travel_id")
	private Travel travel;
	
	@ManyToOne
	@MapsId("userId")
    @JoinColumn(name = "user_id")
	@JsonIgnoreProperties({"firstName","lastName", "password","rol"})
	private User user;
	
	@Column(name = "booking_date", nullable = false)
    private LocalDateTime bookingDate;
	
	public TravelBooking() {
	}

	public TravelBooking(UserTravelKey id, Travel travel, User user, LocalDateTime bookingDate) {
		super();
		this.id = id;
		this.travel = travel;
		this.user = user;
		this.bookingDate = bookingDate;
	}

	public UserTravelKey getId() {
		return id;
	}

	public void setId(UserTravelKey id) {
		this.id = id;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	
	
	
	
	
}
