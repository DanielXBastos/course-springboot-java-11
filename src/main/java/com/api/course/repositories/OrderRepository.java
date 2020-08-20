package com.api.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
