package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.RegistlevelMapper;
import com.neuedu.pojo.Registlevel;
import com.neuedu.service.RegistlevelService;

@Service("registlevelService")
public class RegistlevelServiceImpl implements RegistlevelService {

	@Autowired
	private RegistlevelMapper registlevelMapper;
	
	@Override
	public List<Registlevel> findRegistlevels(Registlevel record) {
		return registlevelMapper.findRegistlevels(record);
	}

	@Override
	public int findCount(Registlevel record) {
		return registlevelMapper.findCount(record);
	}

}
