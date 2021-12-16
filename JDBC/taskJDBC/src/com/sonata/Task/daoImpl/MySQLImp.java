package com.sonata.Task.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sonata.Task.dao.MySQLConnection;
import com.sonata.TaskBean.Task;

public class MySQLImp implements MySQLConnection {
@Override
	public Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tasktracker","root","WearHouse");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

@Override
public boolean addTask(Task task) {
	// TODO Auto-generated method stub
	return false;
}

}
