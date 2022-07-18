package com.mamasclub.happyjar.api.v1.service.impl;

import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.domain.repository.UserRepository;
import com.mamasclub.happyjar.api.v1.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.assertj.core.api.Assertions.assertThat;

class UserServiceImplTest {

    private UserRepository userRepository = Mockito.mock(UserRepository.class);
    private UserService userService;

    @BeforeEach
    public void setUp(){
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    void create() {
        User userDTO = new User("jieun", "origin", "12345", "jieun", "", "","", "Y", "Y");
        //2.
        //when(userRepository.save(any(User.class))).then(returnsFirstArg());
        User user = userService.create(userDTO);
        //3.
        assertThat(user.getUserId()).isEqualTo("jieun");
    }


}
