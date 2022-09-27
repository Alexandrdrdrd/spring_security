package com.sasha.oauthtest.springboot_oauth_test;

import com.sasha.oauthtest.springboot_oauth_test.model.Role;
import com.sasha.oauthtest.springboot_oauth_test.model.User;
import com.sasha.oauthtest.springboot_oauth_test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootOauthTestApplication {


    public static void main(String[] args) {

        SpringApplication.run(SpringbootOauthTestApplication.class, args);


    }


}
