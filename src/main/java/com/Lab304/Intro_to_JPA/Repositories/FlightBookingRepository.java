package com.Lab304.Intro_to_JPA.Repositories;

import com.Lab304.Intro_to_JPA.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
    Optional<FlightBooking> findByFlightNumber(String flightNumber);
    List<FlightBooking> findByAircraftContaining(String search);
    List<FlightBooking> findByDistanceGreaterThan(Integer flightMileage);

}
