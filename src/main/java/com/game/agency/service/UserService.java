package com.game.agency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.agency.entity.SysUser;
import com.game.agency.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public SysUser findUserByUserName(String name) {
		SysUser user = new SysUser();
		try {
			user = mapper.selectUserByUserName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
