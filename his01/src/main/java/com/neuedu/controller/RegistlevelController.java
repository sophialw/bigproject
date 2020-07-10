package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.Registlevel;
import com.neuedu.service.RegistlevelService;
import com.neuedu.util.PageBean;

@Controller
@RequestMapping("registlevel")
public class RegistlevelController {

	@Autowired
	private RegistlevelService registlevelService;
	
	@RequestMapping("/list.do")
	public ModelAndView list(Registlevel registlevel,Integer currentPage) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		//定义分页组件， 设置分页属性
		PageBean<Registlevel> pageBean = new PageBean<>();
		int curpage = (currentPage == null)?1:currentPage;
		int pageSize = 10;
		pageBean.setCurrentPage(curpage);
		pageBean.setPageSize(pageSize);
		
		//将分页信息设置到role对象
		registlevel.setBeginIndex(pageBean.getBeginIndex());
		registlevel.setPageSize(pageSize);
		
		//查询数据
		List<Registlevel> registlevels = registlevelService.findRegistlevels(registlevel);
		//将数据填充到分页对象中
		pageBean.setPageData(registlevels);
		pageBean.setTotalCount(registlevelService.findCount(registlevel));
		//将分页对象写到request中
		mv.addObject("page", pageBean);
				
		
		mv.setViewName("list.jsp");
		return mv;
	}
}
