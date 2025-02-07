package com.cursospringboot.course.repositories;

import com.cursospringboot.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
