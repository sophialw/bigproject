package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.Department;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import com.neuedu.util.PageBean;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("login.do")
	public ModelAndView login(User user,HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		User user2 = userService.login(user);
		if(null != user2) {
			request.getSession().setAttribute("user", user2);
		    mv.setViewName("index.do");
		} else {
			request.setAttribute("msg", "用户名或者密码错误");
			mv.setViewName("login.jsp");
		}
		return mv;
	}
	
	@RequestMapping("logout.do")
	public ModelAndView logout(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		session.invalidate();
		mv.setViewName("login.jsp");
		return mv;
	}
	
	@RequestMapping("/user/list.do")
	public ModelAndView list(User user,Integer currentPage) throws Exception {
		if(user.getUsername() == null || user.getUsername().trim().equals(""))
			user.setUsername(null);
		
		if(user.getRealname() == null || user.getRealname().trim().equals(""))
			user.setRealname(null);
		
		ModelAndView mv = new ModelAndView();
		//定义分页组件， 设置分页属性
		PageBean<User> pageBean = new PageBean<>();
		int curpage = (currentPage == null)?1:currentPage;
		int pageSize = 10;
		pageBean.setCurrentPage(curpage);
		pageBean.setPageSize(pageSize);
		
		//将分页信息设置到role对象
		user.setBeginIndex(pageBean.getBeginIndex());
		user.setPageSize(pageSize);
		
		//查询数据
		List<User> depts = userService.findUsers(user);
		//将数据填充到分页对象中
		pageBean.setPageData(depts);
		pageBean.setTotalCount(userService.findCount(user));
		//将分页对象写到request中
		mv.addObject("page", pageBean);
				
		
		mv.setViewName("list.jsp");
		return mv;
	}
	
	
	
}
