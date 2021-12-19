package com.sonata.fetchtaskimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sonata.UserBean.User;
import com.sonata.fetchtaskiterface.FetchTaskInterface;

public class FetchTaskImpl implements FetchTaskInterface {

	@Override
	public boolean fetcthTask(User username) {
		boolean st =false;
        try {
        	
            //loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection with the database
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","WearHouse");
            PreparedStatement ps = (PreparedStatement) 
            con.prepareStatement("select username,ownerid from userdetails where username=? ");
         
              

            ResultSet rs =(ResultSet) ps.executeQuery();
            st = rs.next();
            if( rs.getString("uname").equals(username))
    			    {
    			    return true;
    			    }else
    			    {
    			    return false;
    			    }
    	
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;  
	}

}
