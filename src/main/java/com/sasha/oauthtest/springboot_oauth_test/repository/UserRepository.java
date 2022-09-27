package com.sasha.oauthtest.springboot_oauth_test.repository;

import com.sasha.oauthtest.springboot_oauth_test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUsername(String name);
}
