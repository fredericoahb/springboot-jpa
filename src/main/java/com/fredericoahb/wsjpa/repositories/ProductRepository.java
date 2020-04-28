package com.fredericoahb.wsjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fredericoahb.wsjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
