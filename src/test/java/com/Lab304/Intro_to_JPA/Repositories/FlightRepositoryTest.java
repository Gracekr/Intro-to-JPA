package com.Lab304.Intro_to_JPA.Repositories;

import com.Lab304.Intro_to_JPA.model.Customer;
import com.Lab304.Intro_to_JPA.model.CustomerStatus;
import com.Lab304.Intro_to_JPA.model.Flight;
import com.Lab304.Intro_to_JPA.model.FlightBooking;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FlightRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private FlightBookingRepository flightBookingRepository;

    @Test
    void TestCreateCustomer(){
        Customer c =new Customer("New Customer", CustomerStatus.SILVER,200);
        customerRepository.save(c);

        Optional<Customer> optionalCustomer = customerRepository.findByCustomerName("New Customer");
        assertTrue(optionalCustomer.isPresent());

    }

    @Test
    void TestfindFlightByNumber(){

        Optional<Flight> optionalFlight= flightRepository.findByFlightNumber("UX190");

        Optional<Flight> optionalFlight1 = flightRepository.findByFlightNumber("UX190");
        assertTrue(optionalFlight1.isPresent());
        assertTrue(optionalFlight1.get().getAircraft().contains("Boeing"));

    }

}