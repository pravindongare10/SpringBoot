package com.cjc.main.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.main.User.Registor;

@Controller
public class HomeController {
	List<Registor> list=new ArrayList<>();

	@RequestMapping("/")
	public String PreLogin() {
		System.out.println("Login Page");
		
		return "login";
	}
	
	@RequestMapping("/new")
	public String NewRegist() {
		System.out.println("registor Page");
		
		return "registor";
	}
	
	@RequestMapping(value = "/save")
	public String createacc(@ModelAttribute Registor u) {
		list.add(u);
		System.out.println(u);
		return "login";
	}
}
