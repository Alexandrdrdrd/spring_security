package com.sasha.oauthtest.springboot_oauth_test.repository;

import com.sasha.oauthtest.springboot_oauth_test.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity, Integer> {
   public TestEntity findTestEntityById(Integer id);
}
