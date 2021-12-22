package com.example.springmvc.demo.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springmvc.demo.MySQLConnection;
import com.example.springmvc.demo.TaskDao;
import com.example.springmvc.demo.model.Task;


@Component
public  class TaskSystemImpl implements TaskDao {
	@Autowired
	MySQLConnection mySQLConnectionImpl;

	public boolean addTask(Task task) throws SQLException{
		boolean flag = false;
		Connection con =mySQLConnectionImpl.getConnection();
		
		String sql = "insert into taskdeatils (taskname,description,status,priority,notes,bookmark,ownerid,creatorid,createdon,modifiedon) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, task.getTaskname());
		st.setString(2, task.getDescription());
		st.setString(3, task.getStatus());
		st.setInt(4, task.getPriority());
		st.setString(5,task.getNotes());
		st.setString(6, task.getIsBookmarked());
		st.setInt(7, task.getOwnerId());
		st.setInt(8, task.getCreatorId());
		st.setDate(9,task.getCreatedOn());
		st.setDate(10,  task.getmodifiedOn());
		
		int r = st.executeUpdate();

		if (r >0) {
			System.out.println(r);
			return true;}
		else 
			return false;
	}

	
}
