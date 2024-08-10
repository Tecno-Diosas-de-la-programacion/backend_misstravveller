package com.missTravveller.app.model.composite_key;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Component
@Embeddable
public class UserTravelKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column( name = "travel_id" )
	Long travelId;
	@Column( name = "user_id" )
	UUID userId;
	
	public UserTravelKey() {
		
	}
	
	public UserTravelKey(Long travelId, UUID userId) {
		this.travelId = travelId;
		this.userId = userId;
	}

	public Long getTravelId() {
		return travelId;
	}

	public void setTravelId(Long travelId) {
		this.travelId = travelId;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	
	

}
