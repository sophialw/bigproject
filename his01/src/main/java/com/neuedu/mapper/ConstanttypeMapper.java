package com.neuedu.mapper;

import com.neuedu.pojo.Constanttype;

public interface ConstanttypeMapper {
    int deleteByPrimaryKey(Integer constanttypeid);

    int insert(Constanttype record);

    int insertSelective(Constanttype record);

    Constanttype selectByPrimaryKey(Integer constanttypeid);

    int updateByPrimaryKeySelective(Constanttype record);

    int updateByPrimaryKey(Constanttype record);
}