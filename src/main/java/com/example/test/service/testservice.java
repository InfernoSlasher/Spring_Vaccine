package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.model.User;
import com.example.test.repository.testrepo;

@Service
public class testservice {
    
    @Autowired
    testrepo repo;

    public void Add(User use) {
        repo.save(use);
    }

    public List<User> getAll() {
        return repo.findAll();
    }

}
