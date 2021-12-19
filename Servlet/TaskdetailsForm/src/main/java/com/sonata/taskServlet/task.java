package com.sonata.taskServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.taskBean.TaskBean;
import com.sonata.taskServletImpl.*;

/**
 * Servlet implementation class task
 */
@WebServlet("/login")
public class task extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		boolean flag = false;
		TaskBean t= new TaskBean();
		t.setName(request.getParameter("taskname"));
		t.setDescription(request.getParameter("taskdesc"));
		t.setStatus(request.getParameter("taskstatus"));
		t.setPriority(request.getParameter("taskpriority"));
		t.setNotes(request.getParameter("tasknotes"));
		t.setIsBookmarked(request.getParameter("isbookmark"));
		t.setOwnerId(Integer.parseInt(request.getParameter("ownerid")));
		try {
			flag = new TaskSystemImpl().addTask(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag) out.println("Sucess");
		else out.println("Not able to insert the task");
		

	}

}
