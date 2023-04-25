package com.example.productcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productcatalog.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, String>{
    
}
