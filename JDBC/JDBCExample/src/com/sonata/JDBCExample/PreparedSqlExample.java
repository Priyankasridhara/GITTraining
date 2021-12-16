package com.sonata.JDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedSqlExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","WearHouse");
			PreparedStatement ps=con.prepareStatement("SELECT * FROM emp.empdeatils where empId=?");
			ps.setInt(1,21276 );
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			}
		catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e) {e.printStackTrace();}
	}

}
