package com.sonata.jobtracker.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sonata.jobtracker.dao.MyConnection;

public class MyConnectionImpl implements MyConnection{
	@Override
	public Connection connectToMySQL() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasktracker","root","WearHouse");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
		
		e.printStackTrace();
	}
	return con;
}
	

}
