package com.missTravveller.app.model;


import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name="itineraries")
public class Itinerary {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "activity", length = 100, nullable =false)
	private String activity;
	@Column(name = "startActivity", length = 12, nullable =false)
	private Timestamp startActivity;
	@Column(name = "endActivity", length = 12, nullable =false)
	private Timestamp endActivity;
	@Column(name = "meetingPoint", length = 45, nullable =false)
	private String meetingPoint;
	
	
	@ManyToOne
    @JoinColumn(name = "travel_id", nullable = false)
    private Travel travel;
	
	public Itinerary() {
		
	}

	public Itinerary(Long id, String activity, Timestamp startActivity, Timestamp endActivity, String meetingPoint,
			Travel travel) {
		super();
		this.id = id;
		this.activity = activity;
		this.startActivity = startActivity;
		this.endActivity = endActivity;
		this.meetingPoint = meetingPoint;
		this.travel = travel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public Timestamp getStartActivity() {
		return startActivity;
	}

	public void setStartActivity(Timestamp startActivity) {
		this.startActivity = startActivity;
	}

	public Timestamp getEndActivity() {
		return endActivity;
	}

	public void setEndActivity(Timestamp endActivity) {
		this.endActivity = endActivity;
	}

	public String getMeetingPoint() {
		return meetingPoint;
	}

	public void setMeetingPoint(String meetingPoint) {
		this.meetingPoint = meetingPoint;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Itinerary [id=");
		builder.append(id);
		builder.append(", activity=");
		builder.append(activity);
		builder.append(", startActivity=");
		builder.append(startActivity);
		builder.append(", endActivity=");
		builder.append(endActivity);
		builder.append(", meetingPoint=");
		builder.append(meetingPoint);
		builder.append(", travel=");
		builder.append(travel);
		builder.append("]");
		return builder.toString();
	}

	




	
	
}
