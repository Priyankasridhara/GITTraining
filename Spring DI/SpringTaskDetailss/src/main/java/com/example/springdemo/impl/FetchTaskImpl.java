package com.example.springdemo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.FetchTaskInterface;
import com.example.springdemo.MySqlConnection;
import com.example.springdemo.model.UserBean;
@Component
public class FetchTaskImpl implements FetchTaskInterface {
	@Autowired
	MySqlConnection mySQLConnectionImpl;
	
	@Override
	public boolean fetcthTask(UserBean u) {
		boolean st =false;
        try {
        	
            //loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection with the database
            Connection c =mySQLConnectionImpl.getConnection();
            
            PreparedStatement ps = (PreparedStatement) c.prepareStatement("select * from taskdeatils");
            ResultSet rs =(ResultSet) ps.executeQuery();
                
            ResultSetMetaData rsmd = rs.getMetaData();

            int columnsNumber = rsmd.getColumnCount();

            
         
                               

         // Iterate through the data in the result set and display it. 

         while (rs.next()) {
         //Print one row          
         for(int i = 1 ; i <= columnsNumber; i++){

               System.out.print(rs.getString(i) + " "); //Print one element of a row

         }

           System.out.println();//Move to the next line to print the next row.           

             }
        }
            
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;  
	}

}
