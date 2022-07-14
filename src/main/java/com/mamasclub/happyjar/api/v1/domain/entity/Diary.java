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
@Entity(name = "DIARY_INFO")
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
public class Diary extends CommonEntity {
    @Id private int diarySeq;
    @Column private int diaryYear;
    @Column private int diaryMonth;
    @Column private int diaryDate;
    @Column private String moodType;
    @Column private String diaryTitle;
    @Column private String diaryContent;
    @Column private String todoYn;
    @Column private String solvedYn;
}
