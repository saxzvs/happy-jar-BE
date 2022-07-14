package com.mamasclub.happyjar.api.v1.domain.repository;

import com.mamasclub.happyjar.api.v1.domain.entity.Diary;
import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.domain.entity.UserID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    @Override
    Diary save(Diary diary);

    @Override
    List<Diary> findAll();

    Optional<Diary> findByCreateBy(String userId);

    List<Diary> findByCreateByAndAndDiaryYear(String userId, int diaryYear);
    List<Diary> findByCreateByAndAndDiaryMonth(String userId, int diaryYear, int diaryMonth);
    List<Diary> findByCreateByAndAndDiaryDate(String userId, int diaryYear, int diaryMonth, int diaryDate);

    void deleteByDiarySeq(int diarySeq);

    Diary update(Diary diary);
}
