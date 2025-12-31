package com.vacheronpradelalyssa.portfolio.controller;

import com.vacheronpradelalyssa.portfolio.model.User;
import com.vacheronpradelalyssa.portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public User getUser() {
        return userRepository.findById(1L).orElse(null);
    }
}