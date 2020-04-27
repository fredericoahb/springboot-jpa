package com.fredericoahb.wsjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fredericoahb.wsjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}