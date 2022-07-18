package com.mamasclub.happyjar.api.v1.service.impl;

import com.mamasclub.happyjar.api.v1.domain.entity.Diary;
import com.mamasclub.happyjar.api.v1.domain.repository.DiaryRepository;
import com.mamasclub.happyjar.api.v1.service.DiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DiaryServiceImpl implements DiaryService {

    private final DiaryRepository diaryRepository;

    @Override
    public Diary create(Diary diary) {
        return diaryRepository.save(diary);
    }

    @Override
    public Optional<Diary> findByCreateBy(String userId) {
        return diaryRepository.findByCreateBy(userId);
    }

    @Override
    public void deleteByDiarySeq(int diarySeq) {
        diaryRepository.deleteByDiarySeq(diarySeq);
    }
}
