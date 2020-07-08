package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Menu;

public interface MenuService {

	public List<Menu> findMenuByUname(String uname) throws Exception;
	
	public List<Menu> findMenus(Menu menu) throws Exception;
	
	public int findCount(Menu menu ) throws Exception;
}
