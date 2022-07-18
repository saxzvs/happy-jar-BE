package com.mamasclub.happyjar.api.v1.domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "COMMON_CODE")
@DynamicInsert
@DynamicUpdate
@IdClass(CommonCodeID.class)
public class CommonCode extends CommonEntity {
    @Id private String baseCode;
    @Id private String subCode;
    @Column private String code_nm;
    @Column private String code_desc;
}
