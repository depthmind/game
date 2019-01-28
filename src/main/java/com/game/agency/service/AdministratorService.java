package com.game.agency.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.agency.entity.SysUser;
import com.game.agency.mapper.UserMapper;

@Service
public class AdministratorService {
	
	static final Logger logger = LoggerFactory.getLogger(AdministratorService.class);

	@Autowired
	private UserMapper mapper;
	
	public SysUser getAdministratorByUserName(String userName) {
		SysUser administrator = new SysUser();
		try {
			//administrator = mapper.selectAdministratorByUserName(userName);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return administrator;
	}
}
