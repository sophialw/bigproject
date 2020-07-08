package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Role;

public interface RoleService {

	public List<Role> findRoles(Role role);
	
	public int findCount(Role role);
}
