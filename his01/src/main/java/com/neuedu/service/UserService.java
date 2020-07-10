package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.User;

public interface UserService {

	
	 public User login(User user) throws Exception;
	 
	 List<User> findUsers(User user);
	    
	 int findCount(User user);
}
