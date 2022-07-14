package com.mamasclub.happyjar.api.v1.service.impl;

import com.mamasclub.happyjar.api.v1.domain.entity.Diary;
import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.domain.entity.UserID;
import com.mamasclub.happyjar.api.v1.domain.repository.DiaryRepository;
import com.mamasclub.happyjar.api.v1.domain.repository.UserRepository;
import com.mamasclub.happyjar.api.v1.service.DiaryService;
import com.mamasclub.happyjar.api.v1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiaryServiceImpl implements DiaryService {

    private DiaryRepository diaryRepository;

    @Autowired
    public DiaryServiceImpl(DiaryRepository diaryRepository){
        this.diaryRepository = diaryRepository;
    }

    @Override
    public Diary create(Diary diary) {
        return diaryRepository.save(diary);
    }

    @Override
    public Optional<Diary> findByCreateBy(String userId) {
        return diaryRepository.findByCreateBy(userId);
    }

    @Override
    public List<Diary> findByCreateByAndAndDiaryYear(String userId, int diaryYear) {
        return diaryRepository.findByCreateByAndAndDiaryYear(userId, diaryYear);
    }

    @Override
    public List<Diary> findByCreateByAndAndDiaryMonth(String userId, int diaryYear, int diaryMonth) {
        return diaryRepository.findByCreateByAndAndDiaryMonth(userId, diaryYear, diaryMonth);
    }

    @Override
    public List<Diary> findByCreateByAndAndDiaryDate(String userId, int diaryYear, int diaryMonth, int diaryDate) {
        return diaryRepository.findByCreateByAndAndDiaryDate(userId, diaryYear, diaryMonth, diaryDate);
    }

    @Override
    public Diary update(Diary diary) {
        return diaryRepository.update(diary);
    }

    @Override
    public void deleteByDiarySeq(int diarySeq) {
        diaryRepository.deleteByDiarySeq(diarySeq);
    }
}
