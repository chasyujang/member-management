package com.chasyu.member.repository;

import com.chasyu.member.model.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//SelectMapper 인터페이스=>UserService 사용
@Mapper
public interface SelectMapper {
    public List<UserVo> findByAll();
}
