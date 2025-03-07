package com.mamasclub.happyjar.api.v1.controller;

import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin (origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/user")
@Log4j2
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @Operation(description = "회원가입")
    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.ok().body(userService.create(user));
    }

    @Operation(description = "회원조회")
    @GetMapping("/read/{no}")
    public ResponseEntity<User> readByNo(@PathVariable int no){
        return ResponseEntity.ok().body(userService.findByUserNo(no).orElse(null));
    }

    @PostMapping("/readById")
    public ResponseEntity<User> readById(@RequestBody String userId, String authType){
        return ResponseEntity.ok().body(userService.findByUserIdAndAuthType(userId, authType).get());
    }

    @Operation(description = "회원정보수정")
    @PutMapping("/update")
    public ResponseEntity<User> update(@RequestBody User user){
        return ResponseEntity.ok().body(userService.update(user));
    }

    @Operation(description = "회원정보삭제")
    @DeleteMapping("/delete/{no}")
    public void delete(@PathVariable int no){
       userService.delete(no);
    }

}
