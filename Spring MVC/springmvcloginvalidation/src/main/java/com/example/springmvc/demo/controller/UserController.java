package com.example.springmvc.demo.controller;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.demo.LoginInterface;


@Controller
public class UserController {
	
	@Autowired
	LoginInterface loginImpl;
	
	
	@RequestMapping("/")
	public String login(ModelMap map) {
		return "login";
	}
	
	
	
	@RequestMapping("/login")
	public String success(Model model,@RequestParam("username") String name, @RequestParam("pwd") String pwd) throws SQLException {
		loginImpl.validateUser(pwd);
		System.out.println(pwd);
		if (loginImpl.validateUser(pwd)==false) {
			System.out.println("valid user");
			return "success";
			}
			else
			{
				model.addAttribute("name","Is a invalid password, Please enter the correct password");
				return "login";
				
			}
		
		
		
	}
}
		


