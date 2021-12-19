package com.sonata.taskServletDao;

import java.sql.SQLException;

import com.sonata.taskBean.TaskBean;

public interface TaskDao {
	public boolean addTask(TaskBean task) throws SQLException;

}
