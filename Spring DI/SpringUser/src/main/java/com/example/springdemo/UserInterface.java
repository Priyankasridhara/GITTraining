package com.example.springdemo;

import java.sql.SQLException;

import com.example.springdemo.model.UserBean;



public interface UserInterface {
	public boolean addUser(UserBean user) throws SQLException;

}
