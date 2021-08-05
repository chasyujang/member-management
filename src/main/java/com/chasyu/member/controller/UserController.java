package com.chasyu.member.controller;

import com.chasyu.member.model.UserVo;
import com.chasyu.member.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserVo> test() {
        return userService.getUsers();
    }


    @GetMapping("/aaa")
    public String test2() {
        return "saaa";
    }

    @PutMapping("/aaa")
    public String test3() {
        return "ssss";
    }
}
