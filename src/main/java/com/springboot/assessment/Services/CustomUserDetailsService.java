package com.springboot.assessment.Services;


import com.springboot.assessment.Schema.User;

import com.springboot.assessment.Doa.UserDoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDoa userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);


        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(), Collections.EMPTY_LIST);
    }
}
