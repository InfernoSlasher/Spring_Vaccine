package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.User;


@Repository
public interface testrepo extends JpaRepository<User, Integer> {
    
}
