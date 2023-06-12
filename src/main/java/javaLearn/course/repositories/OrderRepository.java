package javaLearn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import javaLearn.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
