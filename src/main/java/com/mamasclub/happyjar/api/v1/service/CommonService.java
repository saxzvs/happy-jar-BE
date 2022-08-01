package com.mamasclub.happyjar.api.v1.service;

import com.mamasclub.happyjar.api.v1.domain.entity.CommonCode;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CommonService {
    public Collection<CommonCode> findByBaseCode(String baseCode);
    public Optional<CommonCode> findByBaseCodeAndSubCode(String baseCode, String subCode);
}
