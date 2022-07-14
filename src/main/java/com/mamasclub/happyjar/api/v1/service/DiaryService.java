package com.mamasclub.happyjar.api.v1.service;

import com.mamasclub.happyjar.api.v1.domain.entity.Diary;
import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.domain.entity.UserID;

import java.util.List;
import java.util.Optional;

public interface DiaryService {

    public Diary create(Diary diary);

    public Optional<Diary> findByCreateBy(String userId);

    List<Diary> findByCreateByAndAndDiaryYear(String userId, int diaryYear);
    List<Diary> findByCreateByAndAndDiaryMonth(String userId, int diaryYear, int diaryMonth);
    List<Diary> findByCreateByAndAndDiaryDate(String userId, int diaryYear, int diaryMonth, int diaryDate);

    public Diary update(Diary diary);

    public void deleteByDiarySeq(int diarySeq);
}
