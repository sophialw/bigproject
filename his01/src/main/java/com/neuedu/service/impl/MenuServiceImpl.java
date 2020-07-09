package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.MenuMapper;
import com.neuedu.mapper.RoleMenuMapper;
import com.neuedu.pojo.Menu;
import com.neuedu.pojo.RoleMenu;
import com.neuedu.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menuMapper;
	
	@Autowired
	private RoleMenuMapper roleMenuMapper;
	
	@Override
	public List<Menu> findMenuByUname(String uname) throws Exception {
		
		return menuMapper.findMenuByUname(uname);
	}

	@Override
	public List<Menu> findMenus(Menu menu) throws Exception {
		
		return menuMapper.findMenus(menu);
	}

	@Override
	public int findCount(Menu menu) throws Exception {
		return menuMapper.findCount(menu);
	}

	/*
     * 根据角色的id查询该角色下的所有的菜单
     */
	@Override
	public List<Menu> findMenuByRoleid(int roleid) {
		
		return menuMapper.findMenuByRoleid(roleid);
	}

	@Override
	public int deleteByRoleidMenuid(RoleMenu roleMenu) {
		return roleMenuMapper.deleteByRoleidMenuid(roleMenu);
	}

	@Override
	public List<Menu> findRoleMenuByRoleid(int roleid) {
		
		return menuMapper.findRoleMenuByRoleid(roleid);
	}

	@Override
	public int addRoleMenu(RoleMenu roleMenu) {
		return roleMenuMapper.insert(roleMenu);
	}

	@Override
	public int addMenu(Menu menu) {
		return menuMapper.insert(menu);
	}

}
