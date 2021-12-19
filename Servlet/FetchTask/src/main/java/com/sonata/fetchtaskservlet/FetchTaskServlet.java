package com.sonata.fetchtaskservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

/**
 * Servlet implementation class FetchTaskServlet
 */
@WebServlet("/FetchTaskServlet")
public class FetchTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();        

        String name=request.getParameter("uname"); 
        String ownerid=request.getParameter("oid"); 
        

        try{

               Class.forName("com.mysql.cj.jdbc.Driver");

               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","WearHouse");               

               PreparedStatement ps=con.prepareStatement("select * from taskdeatils where ownerid=?");
               PreparedStatement ps1=con.prepareStatement("select * from userdetails where usename=?");
               
               ps.setString(1,ownerid); 
           
               

               out.print("<table width=25% border=1>");

               out.print("<center><h1>Result:</h1></center>");

               ResultSet rs=ps.executeQuery();                

               /* Printing column names */

               ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();

               while(rs.next())

                  {

               out.print("<tr>");

               out.print("<td>"+rsmd.getColumnName(1)+"</td>");

                  out.print("<td>"+rs.getString(1)+"</td></tr>");

                  out.print("<tr><td>"+rsmd.getColumnName(2)+"</td>");

                  out.print("<td>"+rs.getString(2)+"</td></tr>");

                  out.print("<tr><td>"+rsmd.getColumnName(3)+"</td>");

                  out.print("<td>"+rs.getString(3)+"</td></tr>");

                  out.print("<tr><td>"+rsmd.getColumnName(4)+"</td>");

                  out.print("<td>"+rs.getString(4)+"</td></tr>"); 
                  
                  out.print("<tr><td>"+rsmd.getColumnName(5)+"</td>");

                  out.print("<td>"+rs.getString(5)+"</td></tr>");   
                  
                  out.print("<tr><td>"+rsmd.getColumnName(6)+"</td>");

                  out.print("<td>"+rs.getString(7)+"</td></tr>");
                  
                  out.print("<tr><td>"+rsmd.getColumnName(8)+"</td>");

                  out.print("<td>"+rs.getString(8)+"</td></tr>");
                  
                  out.print("<tr><td>"+rsmd.getColumnName(9)+"</td>");

                  out.print("<td>"+rs.getString(9)+"</td></tr>");   
                  
                  out.print("<tr><td>"+rsmd.getColumnName(10)+"</td>");

                  out.print("<td>"+rs.getString(10)+"</td></tr>");    
                  
                  out.print("<tr><td>"+rsmd.getColumnName(11)+"</td>");

                  out.print("<td>"+rs.getString(11)+"</td></tr>");                  

                  out.print("<br>");



               }

               out.print("</table>");



        }catch (Exception e2)

          {

              e2.printStackTrace();

          }



        finally{out.close();
	}
	}
}


	


