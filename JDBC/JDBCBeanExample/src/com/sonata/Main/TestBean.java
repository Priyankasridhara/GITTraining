package com.sonata.Main;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sonata.DaoImpl.EmpDAOImpl;
import com.sonata.Model.Employee;
public class TestBean {

	public static void main(String args[])
	{
		Employee e1=new Employee();
		
		e1.setEmpId(2);
		e1.setEmpName("priyanka");
		e1.setEmpsal(29000);
		
		EmpDAOImpl dao=new EmpDAOImpl();
		int row=dao.save(e1);
		System.out.println(row);
		List<Employee>list=dao.getData();
		for(Employee e:list)
		{
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpsal());
		}
		
		
		
		}
}