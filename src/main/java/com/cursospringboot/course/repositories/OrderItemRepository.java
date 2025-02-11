package com.cursospringboot.course.repositories;

import com.cursospringboot.course.entities.OrderItem;
import com.cursospringboot.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
