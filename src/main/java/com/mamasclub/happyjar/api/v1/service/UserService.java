package com.mamasclub.happyjar.api.v1.service;

import com.mamasclub.happyjar.api.v1.domain.entity.User;

import java.util.Optional;

public interface UserService {

    public User create(User user);

    public Optional<User> findByUserNo(int userNo);

    public Optional<User> findByUserIdAndAuthType(String userId, String authType);

    public User update(User user);

    public void delete(int userNo);
}
