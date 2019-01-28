package com.game.agency.entity;

import java.util.List;

import lombok.Data;

@Data
public class Resource {

	private Integer id;
	private String url;
	private String name;
	
	private List<Resource> permissionList;
}
