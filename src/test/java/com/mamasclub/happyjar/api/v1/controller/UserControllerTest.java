package com.mamasclub.happyjar.api.v1.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = UserController.class)
public class UserControllerTest {

    @Test
    void readByUserNo(UserID id) {
        String hello="hello";
        System.out.println(hello);
        System.out.println(id);
    }

}
