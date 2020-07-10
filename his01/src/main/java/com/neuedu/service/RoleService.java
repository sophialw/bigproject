package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Role;
import com.neuedu.pojo.UserRole;

public interface RoleService {

	public List<Role> findRoles(Role role);
	
	public int findCount(Role role);
	
	

	public  List<Role>  findAllRoles();
	
	public  int addUserRole(UserRole userRole);
}
