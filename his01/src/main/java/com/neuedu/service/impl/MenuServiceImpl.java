package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.MenuMapper;
import com.neuedu.pojo.Menu;
import com.neuedu.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menuMapper;
	
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

}
