package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Menu;

public interface MenuService {

	public List<Menu> findMenuByUname(String uname) throws Exception;
}
