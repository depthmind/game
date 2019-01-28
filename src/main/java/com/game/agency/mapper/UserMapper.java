package com.game.agency.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.game.agency.entity.SysUser;

@Mapper
public interface UserMapper {

	SysUser selectUserByUserName(String userName);
}
