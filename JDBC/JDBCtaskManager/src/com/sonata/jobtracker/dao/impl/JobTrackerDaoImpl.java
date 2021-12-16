package com.sonata.jobtracker.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

import com.sonata.jobtracker.dao.impl.*;

import com.sonata.jobtracker.model.Task;

public  class JobTrackerDaoImpl implements com.sonata.jobtracker.dao.JobTrackerDao{
	
	public boolean addTask(Task task) throws SQLException{
	boolean added = false;
	Connection conn = new MyConnectionImpl().connectToMySQL();
	String sql = "INSERT INTO Task (taskId,ownerid,name,description) VALUES(?,?,?,?,?)";
	PreparedStatement pst = conn.prepareStatement(sql);
	pst.setInt(1, task.getTaskId());
	pst.setInt(2, task.getOwnerId());
	pst.setString(3, task.getName());
	
	
	int r = pst.executeUpdate(); 
	pst.close();
	conn.close();
	if (r > 0)
	added = true;
	return added;
	}
	 public List<Task>getData()
	  {
		   List<Task>taskList=new ArrayList<>();
		   try
		   {
			   Connection conn = new MyConnectionImpl().connectToMySQL();
			   PreparedStatement cs1=((Statement) conn).getConnection().prepareStatement("SELECT * FROM tasktracker.taskdetails");
			   ResultSet rs=cs1.executeQuery();
			   while(rs.next())
			   {
				   Task emp=new Task();
				   int Id =rs.getInt(1);
				   String Name=rs.getString(2);
				   String priority=rs.getString(3);
				   emp.setCreatorId(Id);;
				   emp.setName(Name);;
				  
				   taskList.add(emp);
			   }
		   }catch(SQLException se)
		   {
			   se.printStackTrace();
				  
				   
				   }
		   return taskList;
		   }

	
	@Override
	public List<Task> getAllTasks() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getAllTasksByStatus(String status) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getAllTasksByOwner(String status) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateTaskStatus(int taskid, String status) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTaskPriority(int taskid, String priority) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTaskNotes(int taskid, String Notes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int assignTaskUser(int taskid, int ownerid) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int save(Task t1) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
