package com.sonata.LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.service.LoginInterface;
import com.sonata.service.impl.LoginImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		LoginInterface login=new LoginImpl();
		boolean flag = true;
		try {
			flag = login.validateUser(request.getParameter("username"), request.getParameter("pwd"));
			System.out.println(flag);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag==true) {
			out.println("Successufly logged in !");
			
		}
		else {
			out.println("Not logged in, please check username and password !");
			
		}
		}
		
	}


