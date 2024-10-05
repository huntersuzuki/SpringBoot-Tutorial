package com.pranay.ecommerceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pranay.ecommerceapp.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
    
}
