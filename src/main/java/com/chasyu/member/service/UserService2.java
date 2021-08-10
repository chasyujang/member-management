package com.chasyu.member.service;

import com.chasyu.member.model.UserVo;
import com.chasyu.member.repository.SelectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService2 {
    @Autowired
    private SelectMapper selectMapper;
    public List<UserVo> getUsers() {
        return selectMapper.findByAll2();
    }
}