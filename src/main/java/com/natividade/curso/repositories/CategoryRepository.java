package com.natividade.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natividade.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
