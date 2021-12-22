package com.example.springmvc.demo.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.springmvc.demo.TaskDao;
import com.example.springmvc.demo.model.Task;



@Controller
@RequestMapping("/taskform")
public class TaskControllerUsingForm {
	
	@Autowired
	TaskDao taskSystemImpl;
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Model model) throws SQLException {
		
		Task t=new Task();
		model.addAttribute("taskModel", t);
		
		
		return "taskform";
		
	
	}

	
	
		
		
	
	@RequestMapping(method = RequestMethod.POST)
	public String insertProduct(@ModelAttribute ("taskModel") Task task, BindingResult result) throws SQLException {
		System.out.println(task.getDescription());
		
		boolean flag=taskSystemImpl.addTask(task);
		if (flag==true) 
			System.out.println("Sucess");
		else 
			System.out.println("Not able to insert the task");
		if(result.hasErrors()) {
			return "taskform";
		}
		else {
			//call some method
			return "home";
		}
		
	}	
	
	
}
	
	

