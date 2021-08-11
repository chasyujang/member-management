package com.chasyu.member.controller;

import com.chasyu.member.model.UserVo;
import com.chasyu.member.service.DeleteService;
import com.chasyu.member.service.UpdateService;
import com.chasyu.member.service.UserService;
import com.chasyu.member.service.UserService2;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserService2 userService2;

    @Autowired
    private DeleteService deleteService;

    @Autowired
    private UpdateService updateService;

    @GetMapping("/all")
    public List<UserVo> UserList() {
        return userService.getUsers();
    }

    @GetMapping("/all2")
    public List<UserVo> UserList2() {
        return userService2.getUsers();
    }

    @GetMapping("/del")
    public void DelList(){ deleteService.DeleteUser(2000);}

    @GetMapping("/up")
    public void Update(){updateService.UpdateUser();}

}
