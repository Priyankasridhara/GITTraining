package com.example.springmvc.demo.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springmvc.demo.TaskDao;
import com.example.springmvc.demo.model.Task;


@Controller
public class TaskController {
	@Autowired
	TaskDao taskSystemImpl;
	@RequestMapping("/kgj")
	public String inserTaskHome(ModelMap map) {
		return "task";
		
	}
	@RequestMapping("/task")
	public String success(Model model,@RequestParam("taskname") String tname, @RequestParam("taskdesc") String des) throws SQLException {
		Task t= new Task();
		t.setTaskname(tname);
		t.setDescription(des);
		
		try {
			boolean flag = taskSystemImpl.addTask(t);
			if (flag) 
				System.out.println("Sucess");
			else 
				System.out.println("Not able to insert the task");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
		
	}

	
}


