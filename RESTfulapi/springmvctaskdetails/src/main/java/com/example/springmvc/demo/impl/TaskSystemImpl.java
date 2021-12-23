package com.example.springmvc.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springmvc.demo.MySQLConnection;
import com.example.springmvc.demo.TaskDao;
import com.example.springmvc.demo.model.Task;
import com.example.springmvc.demo.model.UserBean;

@Component
public class TaskSystemImpl implements TaskDao {
	@Autowired
	MySQLConnection mySQLConnectionImpl;

	@Override
	public boolean addTask(Task task) throws SQLException {

		Connection con = mySQLConnectionImpl.getConnection();

		String sql = "insert into taskdeatils (taskname,description,status,priority,notes,bookmark,ownerid,creatorid,createdon,modifiedon) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, task.getTaskname());
		st.setString(2, task.getDescription());
		st.setString(3, task.getStatus());
		st.setInt(4, task.getPriority());
		st.setString(5, task.getNotes());
		st.setString(6, task.getIsBookmarked());
		st.setInt(7, task.getOwnerId());
		st.setInt(8, task.getCreatorId());
		st.setDate(9, task.getCreatedOn());
		st.setDate(10, task.getmodifiedOn());

		int r = st.executeUpdate();
		con.close();

		if (r > 0) {
			System.out.println(r);
			return true;
		} else
			return false;
	}

	@Override
	public Task getTask(int taskid) throws SQLException {
		{
			boolean flag = false;
			Task task = new Task();
			Connection con = mySQLConnectionImpl.getConnection();
			String sql = "select * from taskdeatils where taskid=? ";
			PreparedStatement st = con.prepareStatement(sql);

			st = con.prepareStatement(sql);

			st.setInt(1, taskid);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {

				task.setCreatedOn(rs.getDate("createdon"));
				task.setmodifiededOn(rs.getDate("modifiedon"));
				task.setCreatorId(rs.getInt("creatorid"));
				task.setDescription(rs.getString("description"));
				task.setIsBookmarked(rs.getString("bookmark"));
				task.setNotes(rs.getString("notes"));
				task.setOwnerId(rs.getInt("ownerid"));
				task.setPriority(rs.getInt("priority"));
				task.setStatus(rs.getString("status"));
				task.setTaskname(rs.getString("taskname"));
				task.setTaskId(rs.getInt("taskid"));
			}
			return task;

		}
	}

	@Override
	public int updateOwnerID(int taskid, int ownerid) {
		Connection con = mySQLConnectionImpl.getConnection();
		int rows = 0;
		try {
			String sql = "update taskdeatils set ownerid=? where taskid=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, ownerid);
			st.setInt(2, taskid);
			rows = st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rows;
	}

	@Override
	public List<Task> getAllTask() {
		Connection con = mySQLConnectionImpl.getConnection();
		List<Task> tasklist= new ArrayList<Task>();
		try {
			String sql = "select * from taskdeatils  ";
			PreparedStatement st = con.prepareStatement(sql);
			

			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				Task  task= new Task();
				task.setCreatedOn(rs.getDate("createdon"));
				task.setmodifiededOn(rs.getDate("modifiedon"));
				task.setCreatorId(rs.getInt("creatorid"));
				task.setDescription(rs.getString("description"));
				task.setIsBookmarked(rs.getString("bookmark"));
				task.setNotes(rs.getString("notes"));
				task.setOwnerId(rs.getInt("ownerid"));
				task.setPriority(rs.getInt("priority"));
				task.setStatus(rs.getString("status"));
				task.setTaskname(rs.getString("taskname"));
				task.setTaskId(rs.getInt("taskid"));
				tasklist.add(task);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return tasklist;

	}

	@Override
	public boolean addUser(UserBean user) throws SQLException {
		Connection con = mySQLConnectionImpl.getConnection();

		String sql = "insert into userdetails (userid ,username ,email ,description ,ownerid ,creatorid ,createdon ,modifiedon) values(?,?,?,?,?,?,?,?)";
		PreparedStatement st;

		st = con.prepareStatement(sql);

		st.setInt(1, user.getUserId());
		st.setString(2, user.getName());
		st.setString(3, user.getEmail());
		st.setString(4, user.getDescription());
		st.setInt(5, user.getOwnerId());
		st.setInt(6, user.getCreatorid());
		st.setDate(7, user.getCreatedOn());
		st.setDate(8, user.getModifiedon());

		int r = st.executeUpdate();

		if (r > 0) {
			System.out.println(r);
			return true;
		} else
			return false;
	}

	@Override
	public int setPriority(int priority, int taskid) {
		Connection con = mySQLConnectionImpl.getConnection();
		int rows = 0;
		try {
			String sql = "update taskdeatils set priority=? where taskid=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, priority);
			st.setInt(2, taskid);
			rows = st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rows;

	}

	@Override
	public int setNote(int taskid, String notes) {
		Connection con = mySQLConnectionImpl.getConnection();
		int rows = 0;
		try {
			String sql = "update taskdeatils set notes=? where taskid=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, notes);
			st.setInt(2, taskid);
			rows = st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rows;
	}

}