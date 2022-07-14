package com.mamasclub.happyjar.api.v1.service;

import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.domain.entity.UserID;

import java.util.Optional;

public interface UserService {

    public User create(User user);

    public Optional<User> findByUserId(UserID id);

    public User update(User user);

    public void delete(UserID id);
}
