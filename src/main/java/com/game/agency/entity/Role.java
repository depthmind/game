package com.game.agency.entity;

import java.util.List;

import lombok.Data;

@Data
public class Role {

	private Integer id;
	private String roleName;
	
	private List<Resource> permissionList;
}
