package com.api.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
