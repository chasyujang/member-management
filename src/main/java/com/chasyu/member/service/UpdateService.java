package com.chasyu.member.service;

import com.chasyu.member.repository.SelectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
    @Autowired
    private SelectMapper selectMapper;

    public void UpdateUser(){
        selectMapper.Update();
    };
}
