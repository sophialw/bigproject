package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.Menu;
import com.neuedu.pojo.Role;
import com.neuedu.pojo.RoleMenu;
import com.neuedu.service.MenuService;
import com.neuedu.util.PageBean;

@Controller
@RequestMapping("menu")
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	
	@RequestMapping("list.do")
	public ModelAndView list(Menu menu,Integer currentPage) throws Exception {
		ModelAndView mv = new ModelAndView();
		//定义分页组件， 设置分页属性
		PageBean<Menu> pageBean = new PageBean<>();
		int curpage = (currentPage == null)?1:currentPage;
		int pageSize = 10;
		pageBean.setCurrentPage(curpage);
		pageBean.setPageSize(pageSize);
		
		//将分页信息设置到role对象
		menu.setBeginIndex(pageBean.getBeginIndex());
		menu.setPageSize(pageSize);
		
		//查询数据
		List<Menu> menus = menuService.findMenus(menu);
		//将数据填充到分页对象中
		pageBean.setPageData(menus);
		pageBean.setTotalCount(menuService.findCount(menu));
		//将分页对象写到request中
		mv.addObject("page", pageBean);
		
		
		mv.setViewName("list.jsp");
		return mv;
	}
	
	/*
     * 根据角色的id查询该角色下的所有的菜单,返回json数据
     */
	@RequestMapping("/findMenuByRoleid.do")
	public @ResponseBody List<Menu> findMenuByroleid(Integer roleid){
		if(roleid != null) {
			return menuService.findMenuByRoleid(roleid);
		} else {
			return null;
		}
	}
	
	@RequestMapping("/deleteRoleMenu.do")
	public @ResponseBody String  deleteRoleMenu(RoleMenu roleMenu) {
		int i = menuService.deleteByRoleidMenuid(roleMenu);
		if(i > 0) {
			return "ok";
		} else {
			return "fail";
		}
		
	}
	//查询指定角色没有使用的菜单列表
	@RequestMapping("/findNoUsedMenu.do")
	public @ResponseBody List<Menu> findMenus(Integer roleid){
		if(roleid != null)
			return menuService.findRoleMenuByRoleid(roleid);
		else {
			return null;
		}
	}
	
	
	@RequestMapping("/addRoleMenu.do")
	public @ResponseBody String  addRoleMenu(RoleMenu roleMenu) {
		int i = menuService.addRoleMenu(roleMenu);
		if(i > 0) {
			return "ok";
		} else {
			return "fail";
		}
		
	}
}
