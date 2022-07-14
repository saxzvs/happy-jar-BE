package com.mamasclub.happyjar.api.v1.domain.repository;

import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.domain.entity.UserID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, UserID> {
    @Override
    User save(User user);

    @Override
    List<User> findAll();

    Optional<User> findByUserId(UserID id);
}
