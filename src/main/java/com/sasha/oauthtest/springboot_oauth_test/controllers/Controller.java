package com.sasha.oauthtest.springboot_oauth_test.controllers;


import com.sasha.oauthtest.springboot_oauth_test.model.TestEntity;
import com.sasha.oauthtest.springboot_oauth_test.model.User;
import com.sasha.oauthtest.springboot_oauth_test.repository.TestEntityRepository;
import com.sasha.oauthtest.springboot_oauth_test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TestEntityRepository testEntityRepository;

    @GetMapping("/protected/{id}")
    @PreAuthorize("hasAuthority('developers:read')")
    public User helloWorldFromProtectedRecourse(@PathVariable int id) {
//        Role role = new Role("ROLE_ADMIN");
//        User user = new User("Sasha", "sasha");
//        user.addRoleToUser(role);
//        userRepository.save(user);
        return userRepository.findById(id).get();
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
