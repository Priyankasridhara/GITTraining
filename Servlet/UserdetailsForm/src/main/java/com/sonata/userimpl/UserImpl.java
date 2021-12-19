package com.sonata.userimpl;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.userbean.UserBean;
import com.sonata.userinterface.UserInterface;

public class UserImpl implements UserInterface {

	
	@Override
	public boolean addUser(UserBean user) throws SQLException {
		boolean flag = false;
		MySQLConnectionImpl con  =  new  MySQLConnectionImpl();
		Connection c = con.getConnection();
		String sql = "insert into userdetails (username,email,description,ownerid,creatorid) values(?,?,?,?,?)";
		PreparedStatement st = c.prepareStatement(sql);
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
