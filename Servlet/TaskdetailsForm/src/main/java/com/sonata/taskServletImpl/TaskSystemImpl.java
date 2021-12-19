package com.sonata.taskServletImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.taskServletDao.*;
import com.sonata.taskBean.*;

public  class TaskSystemImpl implements TaskDao {
	public boolean addTask(TaskBean task) throws SQLException{
		boolean flag = false;
		MySQLConnectionimpl con  =  new  MySQLConnectionimpl();
		Connection c = con.getConnection();
		String sql = "insert into taskdeatils (taskname,description) values(?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, task.getName());
		st.setString(2, task.getDescription());
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
	}

	
}
