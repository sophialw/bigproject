package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Menu;
import com.neuedu.pojo.RoleMenu;

public interface MenuService {

	public List<Menu> findMenuByUname(String uname) throws Exception;
	
	public List<Menu> findMenus(Menu menu) throws Exception;
	
	public int findCount(Menu menu ) throws Exception;
	
	/*
     * 根据角色的id查询该角色下的所有的菜单
     */
	List<Menu> findMenuByRoleid(int roleid);
	
	
	 /*
     * 根据角色id和权限id删除rolemenu中的数据
     * */
    int deleteByRoleidMenuid(RoleMenu roleMenu);
    
    
    /*
     * 查询当前角色没有使用的菜单列表
     */
    List<Menu> findRoleMenuByRoleid(int roleid);
    
	/*
	 * 设置权限
	 */
    
    int addRoleMenu(RoleMenu roleMenu);
}
