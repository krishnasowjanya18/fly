package com.flyaway.simplilearn.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flyaway.simplilearn.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

	@Query(value="select f from Flight f where f.source=:source")
	List<Flight> getAllFlights(String source);

	

}
