package com.mamasclub.happyjar.api.v1.controller;

import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin (origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

//    @Operation(description = "회원가입")
    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.ok().body(userService.create(user));
    }

//    @Operation(description = "회원조회")
    @GetMapping("/read/{no}")
    public ResponseEntity<User> readByNo(@PathVariable int no){
        return ResponseEntity.ok().body(userService.findByUserNo(no).get());
    }

    @PostMapping("/readById")
    public ResponseEntity<User> readById(@RequestBody String userId, String authType){
        return ResponseEntity.ok().body(userService.findByUserIdAndAuthType(userId, authType).get());
    }

//    @Operation(description = "회원정보수정")
    @PutMapping("/update")
    public ResponseEntity<User> update(@RequestBody User user){
        return ResponseEntity.ok().body(userService.update(user));
    }

//    @Operation(description = "회원정보삭제")
    @DeleteMapping("/delete/{no}")
    public void delete(@PathVariable int no){
       userService.delete(no);
    }

}
