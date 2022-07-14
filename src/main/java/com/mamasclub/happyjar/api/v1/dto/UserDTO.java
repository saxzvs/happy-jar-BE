package com.mamasclub.happyjar.api.v1.dto;

import com.mamasclub.happyjar.api.v1.domain.entity.User;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDTO {
    private int userNo;
    private String userId;
    private String userPw;
    private String userNm;

//    public User toEntity(){
//        User userEntity = User.builder()
//                .userNo(userNo)
//                .userId(userId)
//                .userPw(userPw)
//                .userNm(userNm)
//                .build();
//        return userEntity;
//    }
//
//    @Builder
//    public UserDTO(int userNo, String userId, String userPw, String userNm){
//        this.userNo = userNo;
//        this.userId = userId;
//        this.userPw = userPw;
//        this.userNm = userNm;
//
//    }
}
