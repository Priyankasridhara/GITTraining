package com.sonata.Task.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Task.dao.MySQLConnection;
import com.sonata.Task.dao.TaskSystemDao;
import com.sonata.TaskBean.Task;


public class TaskSystemImpl implements TaskSystemDao{

	public boolean  addTask(Task task) throws SQLException {
		// TODO Auto-generated method stub
		boolean flag=false;
		MySQLConnection con=new MySQLImp();
		Connection c=con.getConnection();
		String sql="insert into taskdetails(taskId,ownerId,creatorId,name,description,status,priority,notes) values(?,?,?,?,?,?,?,?)";
		PreparedStatement st =c.prepareStatement(sql);
		st.setInt(1, task.getTaskId());
		st.setInt(2, task.getOwnerId());
		st.setInt(3, task.getCreatorId());
		st.setString(4, task.getName());
		st.setString(5, task.getDescription());
		st.setString(6, task.getStatus());
		st.setString(7,task.getPriority());
		st.setString(8, task.getNotes());
		
		int r=st.executeUpdate();
		return true;
	}
//Hibernate can be used to get data 
	public List<Task>getData()
	  {
		   List<Task>taskList=new ArrayList<>();
		   try
		   {
			   Connection conn = new MySQLImp().getConnection();
			   PreparedStatement ps1=((Statement) conn).getConnection().prepareStatement("SELECT * FROM tasktracker.taskdetails");
			   ResultSet rs=ps1.executeQuery();
			   while(rs.next())
				{
							   Task tk=new Task();
							   int Id =rs.getInt(1);
							   String Name=rs.getString(2);
							   String priority=rs.getString(3);
							   tk.setCreatorId(Id);
							   tk.setName(Name);
							   taskList.add(tk);
						   }
					   }catch(SQLException se)
					   {
						   se.printStackTrace();
							  
							    }
					   return taskList;
					   }

				


}
