package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public User login(User user) throws Exception {
		
		return userMapper.findUserByUnamePwd(user);
	}
	@Override
	public List<User> findUsers(User user) {
		return userMapper.findUsers(user);
	}
	@Override
	public int findCount(User user) {
		return userMapper.findCount(user);
	}

}
