package com.oliveiralia.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiralia.project1.entities.OrderItem;
import com.oliveiralia.project1.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
