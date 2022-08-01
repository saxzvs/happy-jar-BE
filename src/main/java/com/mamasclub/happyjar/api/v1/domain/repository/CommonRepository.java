package com.mamasclub.happyjar.api.v1.domain.repository;

import com.mamasclub.happyjar.api.v1.domain.entity.CommonCode;
import com.mamasclub.happyjar.api.v1.domain.entity.CommonCodeID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CommonRepository extends JpaRepository<CommonCode, CommonCodeID> {
    public Collection<CommonCode> findByBaseCode(String baseCode);
    public Optional<CommonCode> findByBaseCodeAndSubCode(String baseCode, String subCode);
}
