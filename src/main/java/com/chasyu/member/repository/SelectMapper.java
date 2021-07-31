package com.chasyu.member.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SelectMapper {
    boolean isExaminationCategoryExistByCategoryId(Long categoryId);
    boolean isExaminationExistByFarmId(Long farmId);
    boolean isExaminationCategoryExistByExaminationId(Long examinationId);
}
