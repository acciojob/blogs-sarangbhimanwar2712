package com.driver.services;

import com.driver.models.*;
import com.driver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository3;

    public User createUser(String username, String password){

        User user = new User() ;
        user.setUsername(username);
        user.setPassword(password);
        return userRepository3.save(user) ;
    }

    public void deleteUser(int userId){

        userRepository3.deleteById(userId);
    }

    public User updateUser(Integer id, String password){

        User originalUser = userRepository3.findById(id).get() ;
        originalUser.setPassword(password);
        originalUser.setUsername(originalUser.getUsername());
        return userRepository3.save(originalUser) ;
    }
}
