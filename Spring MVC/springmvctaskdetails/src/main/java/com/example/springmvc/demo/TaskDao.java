package com.example.springmvc.demo;

import java.sql.SQLException;

import com.example.springmvc.demo.model.Task;



public interface TaskDao {
	public boolean addTask(Task task) throws SQLException;

}
