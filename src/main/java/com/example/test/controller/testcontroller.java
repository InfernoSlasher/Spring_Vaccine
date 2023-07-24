package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.test.model.User;
import com.example.test.service.testservice;

@Controller
public class testcontroller {
    
    @Autowired
    testservice test;

    @GetMapping("/")
    public String home(Model model) {
        List<User> use = test.getAll();
        model.addAttribute("data", use);
        return "display";
    }

    @GetMapping("/control")
    public String register() {
        return "form";
    }

    @PostMapping("/welcome")
    public String welcome(@ModelAttribute User user, Model model) {
        // System.out.println(user.toString());
        // model.addAttribute("name", user.getName());
        test.Add(user);

        return "redirect:/";
    }

    
}
