package com.mamasclub.happyjar.api.v1.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
        @UniqueConstraint(name="user_info_id_unique", columnNames = {"USER_ID", "AUTH_TYPE"})})
@ApiModel(value = "유저 정보", description = "사용자 정보 Entity Model")
public class User extends CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userNo;
    @ApiModelProperty(value = "유저UUID")
    private String userUuid;
    @ApiModelProperty(value = "유저ID") @Column(name="USER_ID")
    private String userId;
    @ApiModelProperty(value = "인증타입") @Column(name="AUTH_TYPE")
    private String authType;
    @ApiModelProperty(value = "비밀번호") @Column
    private String userPw;
    @ApiModelProperty(value = "사용자명") @Column
    private String userNm;
    @ApiModelProperty(value = "인증키") @Column
    private String authKey;
    @ApiModelProperty(value = "이메일") @Column
    private String email;
    @ApiModelProperty(value = "접속토큰") @Column
    private String access_token;
    @ApiModelProperty(value = "등급") @Column
    private String userGrade;
    @ApiModelProperty(value = "활성화여부") @Column
    private String activateYn;
    @ApiModelProperty(value = "사용여부") @Column
    private String useYn;
}
