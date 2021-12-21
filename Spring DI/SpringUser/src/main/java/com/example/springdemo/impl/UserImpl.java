package com.example.springdemo.impl;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.MySQLConnection;
import com.example.springdemo.UserInterface;
import com.example.springdemo.model.UserBean;

@Component
public class UserImpl implements UserInterface {
	@Autowired
	MySQLConnection mySQLConnectionImpl;
	
	
	@Override
	public boolean addUser(UserBean user) throws SQLException {
		boolean flag = false;
		//MySQLConnectionImpl con  =  new  MySQLConnectionImpl();
		//Connection c = con.getConnection();
		Connection con =mySQLConnectionImpl.getConnection();
		String sql = "insert into userdetails (username,email,description,ownerid,creatorid) values(?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, user.getName());
		st.setString(2, user.getEmail());
		st.setLong(4, user.getOwnerId());
		st.setString(3, user.getDescription());
		st.setInt(5, user.getCreatorid());
		
		
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
		
		
	}

	
}
