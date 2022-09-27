package com.sasha.oauthtest.springboot_oauth_test.repository;

import com.sasha.oauthtest.springboot_oauth_test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByName(String name);
}
