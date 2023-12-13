package com.flyaway.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyaway.simplilearn.entity.SourceDestination;

@Repository
public interface SourceDestinationRepository extends JpaRepository<SourceDestination, Integer>{
	
	

}
