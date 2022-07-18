package com.mamasclub.happyjar.api.v1.domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="USER_INFO"
    , uniqueConstraints = {
        @UniqueConstraint(name="USER_INFO_ID_UNIQUE", columnNames = {"USER_ID", "AUTH_TYPE"})})
public class User extends CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userNo;
    @Column(name="USER_ID") private String userId;
    @Column(name="AUTH_TYPE") private String authType;
    @Column private String userPw;
    @Column private String userNm;
    @Column private String email;
    @Column private String access_token;
    @Column private String userGrade;
    @Column private String activateYn;
    @Column private String useYn;
}
