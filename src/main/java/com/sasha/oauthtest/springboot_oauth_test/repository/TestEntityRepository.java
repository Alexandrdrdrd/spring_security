package com.sasha.oauthtest.springboot_oauth_test.repository;

import com.sasha.oauthtest.springboot_oauth_test.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<TestEntity, Integer> {
}
