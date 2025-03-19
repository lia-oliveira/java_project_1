package com.oliveiralia.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiralia.project1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
