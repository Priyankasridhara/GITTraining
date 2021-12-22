package com.example.springmvc.demo;

import java.sql.SQLException;

public interface LoginInterface {
	public boolean  validateUser(String pwd) throws SQLException;
	

}
