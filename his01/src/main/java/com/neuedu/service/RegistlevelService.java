package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Registlevel;

public interface RegistlevelService {

	
	   List<Registlevel> findRegistlevels(Registlevel record);
	    
	   int findCount(Registlevel record);
}
