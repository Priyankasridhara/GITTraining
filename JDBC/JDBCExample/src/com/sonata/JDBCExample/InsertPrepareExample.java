package com.sonata.JDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertPrepareExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","WearHouse");
			PreparedStatement ps=con.prepareStatement("insert into emp.empdeatils(?,?,?)");
			ps.setInt(1,21276 );
			ps.setString(2, "esh");
			ps.setAsciiStream(3, null, 234460);
			int a=ps.executeUpdate();
			System.out.println("The no of records updated are "+ a);
			}
		catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e) {e.printStackTrace();}
	}


}
