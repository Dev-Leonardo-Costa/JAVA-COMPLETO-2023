package com.educaweb.course.repositories;

import com.educaweb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemRepository extends JpaRepository<Order, Long> {
}
