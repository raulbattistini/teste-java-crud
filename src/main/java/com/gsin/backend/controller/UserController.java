package com.gsin.backend.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gsin.backend.entity.UserEntity;
import com.gsin.backend.service.UserService;

@RestController
public class UserController {


    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/id/{id}")
    public Optional<UserEntity> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/email/{email}")
    public Optional<UserEntity> getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }
}
