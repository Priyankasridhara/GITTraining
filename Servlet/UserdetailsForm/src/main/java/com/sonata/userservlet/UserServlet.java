package com.sonata.userservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.userbean.UserBean;
import com.sonata.userimpl.UserImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/login")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		boolean flag = false;
		UserBean u= new UserBean();
		u.setName(request.getParameter("username"));
		u.setDescription(request.getParameter("desc"));
		u.setEmail(request.getParameter("emailaddress"));
		u.setOwnerId(Integer.parseInt(request.getParameter("oId")));
	    u.setCreatorid(Integer.parseInt(request.getParameter("cId")));
	    //u.setCreatedOn(Date.valueOf(request.getParameter("con")));
	    //u.setModifiedOn(Date.valueOf(request.getParameter("mon")));
		
		try {
			flag = new UserImpl().addUser(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag) out.println("Sucess");
		else out.println("Not able to insert the task");
		
	}

}
