package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.Department;
import com.neuedu.pojo.Menu;
import com.neuedu.service.DeptService;
import com.neuedu.util.PageBean;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@RequestMapping("list.do")
	public ModelAndView list(Department dept,Integer currentPage) {
		if(dept.getDeptname() == null || dept.getDeptname().trim().equals(""))
			dept.setDeptname(null);
		ModelAndView mv = new ModelAndView();
		//定义分页组件， 设置分页属性
		PageBean<Department> pageBean = new PageBean<>();
		int curpage = (currentPage == null)?1:currentPage;
		int pageSize = 10;
		pageBean.setCurrentPage(curpage);
		pageBean.setPageSize(pageSize);
		
		//将分页信息设置到role对象
		dept.setBeginIndex(pageBean.getBeginIndex());
		dept.setPageSize(pageSize);
		
		//查询数据
		List<Department> depts = deptService.findDepts(dept);
		//将数据填充到分页对象中
		pageBean.setPageData(depts);
		pageBean.setTotalCount(deptService.findCount(dept));
		//将分页对象写到request中
		mv.addObject("page", pageBean);
				
		mv.setViewName("list.jsp");
		return mv;
	}
	
}
