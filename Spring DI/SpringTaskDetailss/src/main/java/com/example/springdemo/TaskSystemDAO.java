package com.example.springdemo;

import java.sql.SQLException;

import com.example.springdemo.model.Task;

public interface TaskSystemDAO {
	public boolean addTask(Task task) throws SQLException;

}
