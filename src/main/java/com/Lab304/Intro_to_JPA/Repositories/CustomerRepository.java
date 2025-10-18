package com.Lab304.Intro_to_JPA.Repositories;


import com.Lab304.Intro_to_JPA.model.Customer;
import com.Lab304.Intro_to_JPA.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

    Optional<Customer> findByCustomerName(String customerName);
    List<Customer> findByCustomerStatus(CustomerStatus status);




}
