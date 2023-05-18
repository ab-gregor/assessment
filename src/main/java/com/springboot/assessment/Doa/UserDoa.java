package com.springboot.assessment.Doa;

import com.springboot.assessment.Schema.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDoa extends JpaRepository<User,Integer> {
    public String findByUsername(String userName);

    User findByUserName(String username);
}
