package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.Menu;
import com.neuedu.pojo.Role;
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
}
