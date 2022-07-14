package com.mamasclub.happyjar.api.v1.controller;

import com.mamasclub.happyjar.api.v1.domain.entity.User;
import com.mamasclub.happyjar.api.v1.domain.entity.UserID;
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
    @GetMapping("/read/{id}")
    public ResponseEntity<User> readByUserNo(@PathVariable UserID id){
        return ResponseEntity.ok().body(userService.findByUserId(id).get());
    }

//    @Operation(description = "회원정보수정")
    @PutMapping("/update")
    public ResponseEntity<User> update(@RequestParam User user){
        return ResponseEntity.ok().body(userService.update(user));
    }

//    @Operation(description = "회원정보삭제")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable UserID id){
       userService.delete(id);
    }

}
