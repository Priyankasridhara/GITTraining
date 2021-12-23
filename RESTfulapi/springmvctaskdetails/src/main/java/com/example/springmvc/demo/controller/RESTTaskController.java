package com.example.springmvc.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.springmvc.demo.TaskDao;
import com.example.springmvc.demo.model.Task;
import com.example.springmvc.demo.model.UserBean;

@RestController
public class RESTTaskController {
	@Autowired
	TaskDao taskSystemImpl;

	@GetMapping("/restgettask/{taskid}")
	public Task getTask(@PathVariable int taskid) throws SQLException {

		return taskSystemImpl.getTask(taskid);
	}

	@PostMapping("/restaddtaskm")
	public ResponseEntity<Task> addTask(@RequestBody Task task) throws SQLException {
		taskSystemImpl.addTask(task);
		return new ResponseEntity<Task>(task,HttpStatus.OK);

	}

	@PutMapping("/updateownerid/{taskid}/{ownerid}")
	public void updateOwnerID(@PathVariable int taskid, @PathVariable int ownerid) throws SQLException {

		taskSystemImpl.updateOwnerID(taskid, ownerid);
	}

	@GetMapping("/restgetAlltask/{status}")
	public List<Task> getAllTask() throws SQLException {

		return taskSystemImpl.getAllTask();
	}

	@PostMapping("/restadduser")
	public ResponseEntity<UserBean> addUser(@RequestBody UserBean user) throws SQLException {
		taskSystemImpl.addUser(user);
		return new ResponseEntity<UserBean>(user,HttpStatus.OK);

	}

	@PutMapping("/setpriority/{taskid}/{priority}")
	public void setPriority(@PathVariable int taskid, @PathVariable int priority) throws SQLException {

		taskSystemImpl.setPriority(taskid, priority);
	}
	
	@PutMapping("/setnotes/{taskid}/{notes}")
	public void setNote(@PathVariable int taskid, @PathVariable String notes) throws SQLException {

		taskSystemImpl.setNote(taskid, notes);
	}
	

}
