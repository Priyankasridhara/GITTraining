package com.sonata.Task.dao;

import java.sql.Connection;

import com.sonata.TaskBean.Task;

public interface MySQLConnection {
	public Connection getConnection();

	boolean addTask(Task task);

}
