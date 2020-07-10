package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.DepartmentMapper;
import com.neuedu.pojo.Department;
import com.neuedu.service.DeptService;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

	
	@Autowired
	private DepartmentMapper deptMapper;
	
	@Override
	public List<Department> findDepts(Department department) {
		return deptMapper.findDepts(department);
	}

	@Override
	public int findCount(Department department) {
		return deptMapper.findCount(department);
	}

}
