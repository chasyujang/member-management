package com.chasyu.member.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SelectMapper {
//    public List<UserVo> findByAll();

    boolean isExaminationExistByFarmId(Long farmId);
}
