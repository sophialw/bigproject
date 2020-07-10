package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.RoleMapper;
import com.neuedu.mapper.UserRoleMapper;
import com.neuedu.pojo.Role;
import com.neuedu.pojo.UserRole;
import com.neuedu.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	@Autowired
	private UserRoleMapper userRoleMapper;
	@Override
	public List<Role> findRoles(Role role) {
		
		return roleMapper.findRoles(role);
	}
	@Override
	public int findCount(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.findCountRoles(role);
	}
	@Override
	public List<Role> findAllRoles() {
		
		return roleMapper.findAllRoles();
	}
	@Override
	public int addUserRole(UserRole userRole) {
		// TODO Auto-generated method stub
		return userRoleMapper.insert(userRole);
	}

}
