package com.game.agency.entity;

import java.util.List;

import lombok.Data;
import lombok.Setter;

@Data
public class SysUser {
	private String userName;
	private String password;
	
	private List<Role> roleList;
}
