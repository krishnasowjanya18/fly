package com.flyaway.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyaway.simplilearn.entity.Flight;
import com.flyaway.simplilearn.repository.FlightRepository;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;
	
	public List<Flight> getAllFlights(Flight flight)
	{
		return flightRepository.getAllFlights(flight.getSource());
	}
	
	public void saveFlight(Flight flight)
	{
		flightRepository.save(flight);
	}

}
