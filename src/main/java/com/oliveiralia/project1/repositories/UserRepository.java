package com.oliveiralia.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiralia.project1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
