package com.flyaway.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flyaway.simplilearn.entity.AirLine;
import com.flyaway.simplilearn.service.AirLineService;

@RestController
public class AirLineController {
	
	@Autowired
	private AirLineService airLineService;
	@GetMapping("/getAllAirLines")
	public List<AirLine> getallAirLines()
	{
		return airLineService.getAllAirLines();
	}
	@PostMapping("/insertAirline")
	public ResponseEntity<String> insertAirLine(@RequestBody AirLine airLine)
	{
		airLineService.saveAirLine(airLine);
		return ResponseEntity.ok("Request Saved Successfully");
	}

}
