package com.flyaway.simplilearn.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flyaway.simplilearn.entity.Flight;
import com.flyaway.simplilearn.service.FlightService;

@Controller
public class FlyAwayController {

	@Autowired
	private FlightService flightService;

	@GetMapping("/")
	public String homepage() {

		return "welcome.jsp";
	}

	@PostMapping("/getAllFlights")
	public List<Flight> getAllFligts(@RequestParam("source") String source,
			@RequestParam("destination") String destination, @RequestParam Date dataOfTravel,
			@RequestParam int noOfPersons) {
		Flight flight = new Flight(0,0, source, destination,noOfPersons, dataOfTravel);
		return flightService.getAllFlights(flight);
	}

}
