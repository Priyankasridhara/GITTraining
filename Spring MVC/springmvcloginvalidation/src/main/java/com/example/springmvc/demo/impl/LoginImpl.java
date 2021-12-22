package com.example.springmvc.demo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springmvc.demo.LoginInterface;
import com.example.springmvc.demo.MySQLConnection;


@Component
public class LoginImpl implements LoginInterface {
	@Autowired
	MySQLConnection mySQLConnectionImpl;
	@Override
	public boolean validateUser( String pwd) throws SQLException {
		boolean st =false;
        try {

        	Connection con =mySQLConnectionImpl.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT password FROM login   ");
           
            ResultSet rs =(ResultSet) ps.executeQuery();
            String str = pwd;
           
            System.out.println(str);
            while (rs.next())
            { 
                  String compareTo = rs.getString("password"); 
                  if(str.equals(compareTo )){ 
                      
                      System.out.println("Valid user");
                     
                  } 
                  else {
      				System.out.println(" Not a Valid user");
      			}
                  //System.out.println(st);
            }return st=true;
			
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;  
		
	}

}
