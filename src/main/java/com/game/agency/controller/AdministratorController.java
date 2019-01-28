package com.game.agency.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.game.agency.entity.SysUser;
import com.game.agency.service.AdministratorService;
import com.game.agency.utils.Json;

@Controller
public class AdministratorController {

	static final Logger logger = LoggerFactory.getLogger(AdministratorController.class); 
	
	@Autowired AdministratorService service;
	
	@RequestMapping("/login.html")
	public String login() {
		return "login.html";
	}
}
