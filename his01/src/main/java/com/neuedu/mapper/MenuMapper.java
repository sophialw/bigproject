package com.neuedu.mapper;

import java.util.List;

import com.neuedu.pojo.Menu;

public interface MenuMapper {
	
    int deleteByPrimaryKey(Integer menuid);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer menuid);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
    
    List<Menu> findMenuByUname(String uname);
    
    List<Menu> findMenus(Menu menu);
    
    int findCount(Menu menu);
    
    /*
     * 根据角色的id查询该角色下的所有的菜单
     */
    List<Menu> findMenuByRoleid(int roleid);
    
    /*
     * 查询当前角色没有使用的菜单列表
     */
    List<Menu> findRoleMenuByRoleid(int roleid);
}