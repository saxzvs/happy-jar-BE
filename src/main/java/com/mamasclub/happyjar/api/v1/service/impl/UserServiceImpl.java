package com.mamasclub.happyjar.api.v1.service.impl;

import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.domain.entity.UserID;
import com.mamasclub.happyjar.api.v1.domain.repository.UserRepository;
import com.mamasclub.happyjar.api.v1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        System.out.println(user.toString());
        return userRepository.save(user);
    }

    public Optional<User> findByUserId(UserID id) {
        return userRepository.findByUserId(id);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(UserID id) {
        userRepository.deleteById(id);
    }

}
