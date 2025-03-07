package com.gsin.backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gsin.backend.entity.UserEntity;
import com.gsin.backend.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository jdbcRepository;

    public UserService(UserRepository jdbcRepository){
        this.jdbcRepository = jdbcRepository;
    }
    
    public Optional<UserEntity> getUserById(Long id){
        return jdbcRepository.findById(id);
    }

    public Optional<UserEntity> getUserByEmail(String email){
        return jdbcRepository.findByEmail(email);
    }
}
