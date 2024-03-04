package com.cjc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String PreLogin() {

	return "index";
	}
	
	@RequestMapping("/*")
	public String errorpage() {

	return "error";
	}
	
	@RequestMapping("/Log")
	public String Loginpage() {

	return "login";
	} 

}
