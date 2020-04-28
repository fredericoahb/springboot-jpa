package com.fredericoahb.wsjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fredericoahb.wsjpa.entities.OrderItem;
import com.fredericoahb.wsjpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}