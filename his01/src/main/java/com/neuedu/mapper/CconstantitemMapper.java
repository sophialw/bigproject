package com.neuedu.mapper;

import com.neuedu.pojo.Cconstantitem;

public interface CconstantitemMapper {
    int deleteByPrimaryKey(Integer constrantitemid);

    int insert(Cconstantitem record);

    int insertSelective(Cconstantitem record);

    Cconstantitem selectByPrimaryKey(Integer constrantitemid);

    int updateByPrimaryKeySelective(Cconstantitem record);

    int updateByPrimaryKey(Cconstantitem record);
}