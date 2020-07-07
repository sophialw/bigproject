package com.neuedu.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.User;

public class LoginCheck implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//获取用户的请求地址
		String url = request.getRequestURI();
		if(url.indexOf("login") != -1) {
			//用户进行的是登录逻辑
			return true;
		} else {
			//获取用户的信息
			HttpSession session = request.getSession();
			User user =(User)session.getAttribute("user");
			if(null != user) {
				//会话范围内有用户信息， 说明用户已经登录过
				return true;
			} else {
				request.setAttribute("msg", "请您先登录！");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return false;
			}
		}
		
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
	

}
