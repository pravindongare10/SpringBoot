package com.cjc.curd.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.curd.webapp.main.model.Student;
import com.cjc.curd.webapp.main.service.HomeService;



@Controller
public class HomeController 
{

	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	
	@RequestMapping("/registration")
	public String preRegister()
	{
		return "registration";
	}

	@RequestMapping("/reg")
	public String regData(@ModelAttribute Student s)
	{
		hs.saveData(s);
		return "login"; 
	}
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("uname")String un,@RequestParam("password")String pass,Model m) {
		hs.logincheck(un,pass);
		Iterable<Student>list=hs.displayAllData();
		m.addAttribute("data",list);
		return "success";
	
	}
	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute Student s,Model m) {
		hs.deleteData(s);
		Iterable<Student>list=hs.displayAllData();
		m.addAttribute("data",list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editData(@RequestParam("uid") int uid,Model m) {
		
		Student s=hs.editData(uid);
		m.addAttribute("data",s);
		return "edit";
	}
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student s,Model m) {
		
		hs.saveData(s);
		Iterable<Student>list=hs.displayAllData();
		m.addAttribute("data",list);
		return "success";
	}
	
}

