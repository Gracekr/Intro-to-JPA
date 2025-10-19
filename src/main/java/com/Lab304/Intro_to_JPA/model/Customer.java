package com.Lab304.Intro_to_JPA.model;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Customerid;
    private String customerName;

    @Enumerated (EnumType.STRING)
    private CustomerStatus customerStatus;

    private int totalCustomerMileage;

    public Customer(String newCustomer, CustomerStatus silver, int i) {
    }

    public Customer(Integer customerid, String customerName, CustomerStatus customerStatus, int totalCustomerMileage) {
        Customerid = customerid;
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public int getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(int totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.Customerid = customerid;
    }

}
