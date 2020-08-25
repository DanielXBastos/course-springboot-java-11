package com.api.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
