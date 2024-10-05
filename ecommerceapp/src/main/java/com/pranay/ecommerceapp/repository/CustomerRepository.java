package com.pranay.ecommerceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pranay.ecommerceapp.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    
}
