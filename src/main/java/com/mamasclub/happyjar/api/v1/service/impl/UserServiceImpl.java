package com.mamasclub.happyjar.api.v1.service.impl;

import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.domain.repository.UserRepository;
import com.mamasclub.happyjar.api.v1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

//    @Autowired
//    public UserServiceImpl(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findByUserNo(int userNo) {
        return userRepository.findByUserNo(userNo);
    }

    public Optional<User> findByUserIdAndAuthType(String userId, String authType) {
        return userRepository.findByUserIdAndAuthType(userId, authType);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public void delete(int userNo) {
        userRepository.deleteById(userNo);
    }

}
