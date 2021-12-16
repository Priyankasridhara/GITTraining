package com.sonata.Task.dao;

import java.sql.SQLException;
import java.util.List;


import com.sonata.TaskBean.Task;

public interface TaskSystemDao {
	public boolean addTask(Task task) throws SQLException;
	public List<Task>getData();

}
