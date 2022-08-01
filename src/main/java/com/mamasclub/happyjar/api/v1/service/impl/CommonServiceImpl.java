package com.mamasclub.happyjar.api.v1.service.impl;

import com.mamasclub.happyjar.api.v1.domain.entity.CommonCode;
import com.mamasclub.happyjar.api.v1.domain.repository.CommonRepository;
import com.mamasclub.happyjar.api.v1.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class CommonServiceImpl implements CommonService {

    private final CommonRepository commonRepository;

    @Override
    public Collection<CommonCode> findByBaseCode(String baseCode) {
        return commonRepository.findByBaseCode(baseCode);
    }

    @Override
    public Optional<CommonCode> findByBaseCodeAndSubCode(String baseCode, String subCode) {
        return commonRepository.findByBaseCodeAndSubCode(baseCode, subCode);
    }
}
