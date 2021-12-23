package com.example.springmvc.demo;

import java.sql.SQLException;
import java.util.List;

import com.example.springmvc.demo.model.Task;
import com.example.springmvc.demo.model.UserBean;



public interface TaskDao {
	public boolean addTask(Task task) throws SQLException;
	public Task getTask(int taskid) throws SQLException;
	public int updateOwnerID(int taskid, int ownerid);
	public List<Task> getAllTask();
	public boolean addUser(UserBean user) throws SQLException;
	public int setPriority(int priority, int taskid);
	public int setNote(int taskid,String notes);

}
