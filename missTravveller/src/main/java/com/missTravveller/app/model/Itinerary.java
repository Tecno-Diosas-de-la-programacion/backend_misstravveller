package com.missTravveller.app.model;


import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name="itineraries")
public class Itinerary {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String activity;
	private Timestamp start_activity;
	private Timestamp end_activity;
	private String meeting_point;
	
	
	@ManyToOne
    @JoinColumn(name = "travel_id", nullable = false)
    private Travel travel;
	
	public Itinerary() {
		
	}

	public Itinerary(Long id, String activity, Timestamp start_activity, Timestamp end_activity, String meeting_point,
			Travel travel) {
		super();
		this.id = id;
		this.activity = activity;
		this.start_activity = start_activity;
		this.end_activity = end_activity;
		this.meeting_point = meeting_point;
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

	public Timestamp getStart_activity() {
		return start_activity;
	}

	public void setStart_activity(Timestamp start_activity) {
		this.start_activity = start_activity;
	}

	public Timestamp getEnd_activity() {
		return end_activity;
	}

	public void setEnd_activity(Timestamp end_activity) {
		this.end_activity = end_activity;
	}

	public String getMeeting_point() {
		return meeting_point;
	}

	public void setMeeting_point(String meeting_point) {
		this.meeting_point = meeting_point;
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
		builder.append(", start_activity=");
		builder.append(start_activity);
		builder.append(", end_activity=");
		builder.append(end_activity);
		builder.append(", meeting_point=");
		builder.append(meeting_point);
		builder.append(", travel=");
		builder.append(travel);
		builder.append("]");
		return builder.toString();
	}

	
	
}
