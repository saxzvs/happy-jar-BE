package com.mamasclub.happyjar.api.v1.domain.repository;

import com.mamasclub.happyjar.api.v1.domain.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    @Override
    Diary save(Diary diary);

    Optional<Diary> findByCreateBy(String userId);

    void deleteByDiarySeq(int diarySeq);
}
