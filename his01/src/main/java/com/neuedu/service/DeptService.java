package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Department;

public interface DeptService {

	
	 List<Department> findDepts(Department department);
	    
	 int findCount(Department department);
}
