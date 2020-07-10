package com.neuedu.mapper;

import java.util.List;

import com.neuedu.pojo.Registlevel;

public interface RegistlevelMapper {
    int deleteByPrimaryKey(Integer registlevelid);

    int insert(Registlevel record);

    int insertSelective(Registlevel record);

    Registlevel selectByPrimaryKey(Integer registlevelid);

    int updateByPrimaryKeySelective(Registlevel record);

    int updateByPrimaryKey(Registlevel record);
    
    List<Registlevel> findRegistlevels(Registlevel record);
    
    int findCount(Registlevel record);
}