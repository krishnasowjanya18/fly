package com.flyaway.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyaway.simplilearn.entity.SourceDestination;
import com.flyaway.simplilearn.repository.SourceDestinationRepository;

@Service
public class SourceDestinationService {
	@Autowired
	private SourceDestinationRepository sourceDestinationRepository;

	public List<SourceDestination> getAllSourceAndDestination() {
		// TODO Auto-generated method stub
		return sourceDestinationRepository.findAll();
	}
	
	public void saveSourceAndDestination(SourceDestination sourceDestination)
	{
		sourceDestinationRepository.save(sourceDestination);
	}

}
