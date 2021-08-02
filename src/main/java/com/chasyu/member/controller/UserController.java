package com.chasyu.member.controller;

import com.chasyu.member.model.UserVo;
import com.chasyu.member.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/user")
@Controller

public class UserController {
    private UserService userService;



    @GetMapping("/all")
    public List<UserVo> test() {
        return userService.getUsers();
    }

}
