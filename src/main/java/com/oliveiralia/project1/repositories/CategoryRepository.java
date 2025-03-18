package com.oliveiralia.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiralia.project1.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
