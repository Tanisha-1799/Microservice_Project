package com.tantech.orderservice.repository;

import com.tantech.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    //A repository interface that extends JPA so that we can get a model for creating a database
}
