package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.RoleMapper;
import com.neuedu.pojo.Role;
import com.neuedu.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	@Override
	public List<Role> findRoles(Role role) {
		
		return roleMapper.findRoles(role);
	}
	@Override
	public int findCount(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.findCountRoles(role);
	}

}
