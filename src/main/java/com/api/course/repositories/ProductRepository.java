package com.api.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
