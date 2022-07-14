package com.mamasclub.happyjar.api.v1.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "USER_INFO")
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@IdClass(UserID.class)
public class User extends CommonEntity {

    @Id private String userId;
    @Id private String authType;
    @Column private String userPw;
    @Column private String userNm;
    @Column private String email;
    @Column private String access_token;
    @Column private String userGrade;
    @Column private String activateYn;
    @Column private String useYn;
}
