package com.neuedu.mapper;

import com.neuedu.pojo.RoleMenu;

public interface RoleMenuMapper {
    int deleteByPrimaryKey(Integer rmid);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    RoleMenu selectByPrimaryKey(Integer rmid);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);
}