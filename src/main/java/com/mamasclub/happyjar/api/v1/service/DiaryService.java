package com.mamasclub.happyjar.api.v1.service;

import com.mamasclub.happyjar.api.v1.domain.entity.Diary;

import java.util.Optional;

public interface DiaryService {

    public Diary create(Diary diary);

    public Optional<Diary> findByCreateBy(String userId);

    public void deleteByDiarySeq(int diarySeq);
}
