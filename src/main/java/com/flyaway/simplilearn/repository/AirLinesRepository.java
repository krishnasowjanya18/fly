package com.flyaway.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyaway.simplilearn.entity.AirLine;
@Repository
public interface AirLinesRepository extends JpaRepository<AirLine,Integer>{

}
