package com.flyaway.simplilearn.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flyaway.simplilearn.entity.SourceDestination;
import com.flyaway.simplilearn.service.SourceDestinationService;

@RestController
public class SourceDestinationController {
	@Autowired
	private SourceDestinationService sourceDestinatioSerivce;
	@GetMapping("/getAllSourceAndDestinations")
	public List<SourceDestination> getAllSourceAndDestinations()
	{
		return sourceDestinatioSerivce.getAllSourceAndDestination();
	}
	@PostMapping("/saveSourceAndDestinations")
	public ResponseEntity<String> saveSourceAndDestinations(@RequestBody SourceDestination soruceDestination)
	{
		sourceDestinatioSerivce.saveSourceAndDestination(soruceDestination);
		return ResponseEntity.ok("Request Saved Successfully");
	}

}
