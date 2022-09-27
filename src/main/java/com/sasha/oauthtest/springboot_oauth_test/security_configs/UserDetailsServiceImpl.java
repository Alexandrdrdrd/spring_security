package com.sasha.oauthtest.springboot_oauth_test.security_configs;

import com.sasha.oauthtest.springboot_oauth_test.model.User;
import com.sasha.oauthtest.springboot_oauth_test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByName(username).orElseThrow(() ->
                new UsernameNotFoundException("User not found"));
        return SecurityUser.fromUser(user);
    }
}
