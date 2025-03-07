package com.gsin.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
/* import org.springframework.data.repository.CrudRepository; */
import org.springframework.stereotype.Repository;

import com.gsin.backend.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
