package com.cursospringboot.course.repositories;

import com.cursospringboot.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
