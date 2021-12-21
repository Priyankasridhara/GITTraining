package com.example.springdemo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.UserValidationInterface;
import com.example.springdemo.MySQLConnection;
import com.example.springdemo.model.User;



@Component
public class UserValidationImpl implements UserValidationInterface {
	@Autowired
	MySQLConnection mySQLConnectionImpl;
	@Override
	public boolean validateUser(User u) throws SQLException {
		boolean st =false;
       

            //loading drivers for mysql
        	Connection con =mySQLConnectionImpl.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT password FROM login   ");
           
            ResultSet rs =(ResultSet) ps.executeQuery();
            String str = u.getPassword(); 
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
	
        }