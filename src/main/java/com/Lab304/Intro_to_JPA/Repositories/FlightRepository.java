package com.Lab304.Intro_to_JPA.Repositories;

import com.Lab304.Intro_to_JPA.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository <Flight, Integer> {

    Optional<Flight> findByFlightNumber(String flightNumber);
    List<Flight> findByAircraftNameContains(String search);
    List<Flight> findByMileageGreaterThan(Integer flifhtMileage);
}
