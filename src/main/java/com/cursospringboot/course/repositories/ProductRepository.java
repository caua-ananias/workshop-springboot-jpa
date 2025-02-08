package com.cursospringboot.course.repositories;

import com.cursospringboot.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
