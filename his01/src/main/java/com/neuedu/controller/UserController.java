package com.neuedu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.User;
import com.neuedu.service.UserService;

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
}
