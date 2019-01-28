package com.game.agency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/auth")
	public void auth(String userName, String password) {
		System.out.println("1");
	}
}
