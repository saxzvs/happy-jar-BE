package com.mamasclub.happyjar.api.v1.domain.entity;

import lombok.Getter;

@Getter
public class SessionUser {
    private String name;
    private String email;

    public SessionUser(User user){
        this.name = user.getUserNm();
        this.email = user.getEmail();
    }
}
