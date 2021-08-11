package com.chasyu.member.service;

import com.chasyu.member.repository.SelectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteService {
    @Autowired
    private SelectMapper selectMapper;
    public void DeleteUser(int pay){
        selectMapper.Delete(pay);
    }

}
