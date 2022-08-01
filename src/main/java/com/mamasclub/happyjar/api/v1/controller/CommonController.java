package com.mamasclub.happyjar.api.v1.controller;

import com.mamasclub.happyjar.api.v1.domain.entity.CommonCode;
import com.mamasclub.happyjar.api.v1.service.CommonService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/common")
@Log4j2
@RequiredArgsConstructor
public class CommonController {

    private final CommonService commonService;

    @Operation(description = "기본 공통코드 조회")
    @PostMapping("/read/{baseCode}")
    public ResponseEntity<Collection<CommonCode>> readByBaseCode(@PathVariable String baseCode){
        return ResponseEntity.ok().body(commonService.findByBaseCode(baseCode));
    }

    @Operation(description = "특정 공통코드 조회")
    @PostMapping("/read/{baseCode}/{subCode}")
    public ResponseEntity<CommonCode> readByBaseCodeAndSubCode(@PathVariable String baseCode, @PathVariable String subCode){
        return ResponseEntity.ok().body(commonService.findByBaseCodeAndSubCode(baseCode, subCode).orElse(null));
    }


}
