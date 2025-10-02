package com.natividade.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natividade.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
