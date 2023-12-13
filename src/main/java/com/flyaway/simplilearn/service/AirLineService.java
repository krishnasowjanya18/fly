package com.flyaway.simplilearn.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyaway.simplilearn.entity.AirLine;
import com.flyaway.simplilearn.repository.AirLinesRepository;

@Service
public class AirLineService {
	@Autowired
	private AirLinesRepository airLinesRepository;
	
	public List<AirLine> getAllAirLines()
	{
		return airLinesRepository.findAll();
	}

	public void saveAirLine(AirLine airLine) {
		airLinesRepository.save(airLine);
		
	}
	

}
