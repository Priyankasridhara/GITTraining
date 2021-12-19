package com.sonata.userinterface;

import java.sql.SQLException;

import com.sonata.userbean.UserBean;

public interface UserInterface {
	public boolean addUser(UserBean user) throws SQLException;

}
