package com.example.springdemo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springdemo.model.User;
import com.example.springdemo.model.UserBean;

@SpringBootApplication
public class SpringUserApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = SpringApplication.run(SpringUserApplication.class, args);
		UserValidationInterface l=(UserValidationInterface) ctx.getBean("loginImpl");
		User u =new User();
		u.setUsername("priyanka");
		u.setPassword("deadl");
		l.validateUser(u) ;
		
		UserInterface user=(UserInterface) ctx.getBean("userImpl");
		UserBean u1=new UserBean();
		u1.setDescription("available");
		u1.setEmail("priyanka2gmail.com");
		user.addUser(u1);
		
	}

}
