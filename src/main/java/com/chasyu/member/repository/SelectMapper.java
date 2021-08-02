package com.chasyu.member.repository;

import com.chasyu.member.model.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SelectMapper {
    public List<UserVo> findByAll();

}
