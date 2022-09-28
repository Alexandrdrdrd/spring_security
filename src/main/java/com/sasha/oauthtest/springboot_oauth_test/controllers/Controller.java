package com.sasha.oauthtest.springboot_oauth_test.controllers;


import com.sasha.oauthtest.springboot_oauth_test.model.Role;
import com.sasha.oauthtest.springboot_oauth_test.model.TestEntity;

import com.sasha.oauthtest.springboot_oauth_test.repository.TestEntityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController

public class Controller {
    private static final String role= "ADMIN";


    @Autowired
    TestEntityRepository testEntityRepository;

    @GetMapping("/api/protected/{id}")
  //  @PreAuthorize("hasAuthority('developers:read')")
    @Secured(role)
    public TestEntity helloWorldFromProtectedRecourse(@PathVariable int id) {
        return testEntityRepository.findTestEntityById(id);
    }

    @GetMapping("/")

    public String hello() {
        return "hello";
    }

    @PostMapping("/api/create_test_entity")
    @PreAuthorize("hasAuthority('developers:write')")
    public TestEntity createTestEntity(@RequestBody TestEntity testEntity) {
        System.out.println(testEntity.getId());
        testEntityRepository.save(testEntity);
        System.out.println(testEntity.getId());
        return testEntity;
    }

}
