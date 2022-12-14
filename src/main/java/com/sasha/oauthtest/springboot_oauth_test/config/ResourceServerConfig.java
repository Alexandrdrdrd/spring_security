package com.sasha.oauthtest.springboot_oauth_test.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
         http.authorizeRequests()
                 .antMatchers("/").permitAll()
                 .antMatchers("/api/**").authenticated();
    }
}
