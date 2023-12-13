package com.flyaway.simplilearn.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int flightNo;
	private String source;
	private String destination;
	private int noOfPersons;
	private Date dateOfTravel;

	public Flight(int id,int flightNo, String source, String destination, int noOFPersons, Date dateOFTravel) {
		super();
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
		this.noOfPersons = noOFPersons;
		this.dateOfTravel = dateOFTravel;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public Date getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}	

}
