package com.natividade.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natividade.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
