package com.flyaway.simplilearn.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class AirLine {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int id;
	private String AirLines;
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="flight_id")
	List<Flight> flightsList;
	public AirLine() {
		super();
	}
	public AirLine(int id, String airLines, List<Flight> flightsList) {
		super();
		this.id = id;
		AirLines = airLines;
		this.flightsList = flightsList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirLines() {
		return AirLines;
	}
	public void setAirLines(String airLines) {
		AirLines = airLines;
	}
	public List<Flight> getFlightsList() {
		return flightsList;
	}
	public void setFlightsList(List<Flight> flightsList) {
		this.flightsList = flightsList;
	}
	
	

}
