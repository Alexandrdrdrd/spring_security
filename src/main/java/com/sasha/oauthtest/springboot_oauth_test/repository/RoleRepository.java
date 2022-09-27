package com.sasha.oauthtest.springboot_oauth_test.repository;

import com.sasha.oauthtest.springboot_oauth_test.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleByName(String name);
}
