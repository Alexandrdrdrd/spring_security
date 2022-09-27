package com.sasha.oauthtest.springboot_oauth_test.controllers;


import com.sasha.oauthtest.springboot_oauth_test.model.TestEntity;

import com.sasha.oauthtest.springboot_oauth_test.repository.TestEntityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {


    @Autowired
    TestEntityRepository testEntityRepository;

    @GetMapping("/protected/{id}")
    @PreAuthorize("hasAuthority('developers:write')")
    public TestEntity helloWorldFromProtectedRecourse(@PathVariable int id) {
        return testEntityRepository.findTestEntityById(id);
    }

    @PostMapping("/create_test_entity")
    @PreAuthorize("hasAuthority('developers:write')")
    public TestEntity createTestEntity(@RequestBody TestEntity testEntity) {
        System.out.println(testEntity.getId());
        testEntityRepository.save(testEntity);
        System.out.println(testEntity.getId());
        return testEntity;
    }

}
