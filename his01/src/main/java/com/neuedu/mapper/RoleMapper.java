package com.neuedu.mapper;

import java.util.List;

import com.neuedu.pojo.Role;

public interface RoleMapper {
	
    int deleteByPrimaryKey(Integer roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    List<Role>  findRoles(Role role);
    
    int findCountRoles(Role role);
    
    
    List<Role>  findAllRoles();
}