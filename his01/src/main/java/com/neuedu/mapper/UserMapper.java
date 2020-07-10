package com.neuedu.mapper;

import java.util.List;

import com.neuedu.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    
    User findUserByUnamePwd(User user);
    
    
    List<User> findUsers(User user);
    
    int findCount(User user);
}