package com.blink.quizapp.repository;

import java.util.Optional;

import com.blink.quizapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameIgnoreCase(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
