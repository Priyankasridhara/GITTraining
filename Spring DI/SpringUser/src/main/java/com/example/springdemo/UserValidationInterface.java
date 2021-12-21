package com.example.springdemo;

import java.sql.SQLException;

import com.example.springdemo.model.User;

public interface UserValidationInterface {
	public boolean  validateUser(User u ) throws SQLException;

	
	

}
