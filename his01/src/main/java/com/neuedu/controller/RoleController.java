package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.Role;
import com.neuedu.pojo.UserRole;
import com.neuedu.service.RoleService;
import com.neuedu.util.PageBean;

@Controller
@RequestMapping("role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping("list.do")
	public ModelAndView list(Role role,Integer currentPage) {
		ModelAndView mv = new ModelAndView();
		//定义分页工具类对象，设置分页属性
		PageBean<Role> pageBean = new PageBean<>();
		int curpage = (currentPage == null)?1:currentPage;
		int pageSize = 10;
		pageBean.setCurrentPage(curpage);
		pageBean.setPageSize(pageSize);
		//将分页信息设置到role对象
		role.setBeginIndex(pageBean.getBeginIndex());
		role.setPageSize(pageSize);
		//查询数据
		List<Role> roles = roleService.findRoles(role);
		//将数据填充到分页对象中
		pageBean.setPageData(roles);
		pageBean.setTotalCount(roleService.findCount(role));
		//将分页对象写到request中
		mv.addObject("page", pageBean);
		mv.setViewName("list.jsp");
		return mv;
	}
	
	@RequestMapping("findAllRoles.do")
	public @ResponseBody List<Role> findAllRoles(){
		return roleService.findAllRoles();
	}
	
	@RequestMapping("addUserRole.do")
	public @ResponseBody String addUserRole(UserRole userRole) {
		int i = roleService.addUserRole(userRole);
		if(i>0) {
			return "ok";
		} else {
			return "fail";
		}
	}
}
