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
public class SourceDestination {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String source;
	private String Destination;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "sourcedestination_id")
	List<Flight> flightsList;

	public SourceDestination() {
		super();
	}

	public SourceDestination(int id, String source, String destination, List<Flight> flightsList) {
		super();
		this.id = id;
		this.source = source;
		Destination = destination;
		this.flightsList = flightsList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public List<Flight> getFlightsList() {
		return flightsList;
	}

	public void setFlightsList(List<Flight> flightsList) {
		this.flightsList = flightsList;
	}

}
