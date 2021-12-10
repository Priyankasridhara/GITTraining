package com.sonata.exmaple;

import java.util.ArrayList;

public class UserEmployee {

	public static void main(String[] args) {
	
		EmployeeImpl emp=new EmployeeImpl();
		

		Employee e=new Employee();
		e.setEmpId(21276);
		e.setEmpName("Priyanka");
		e.setEmpSalary(45000);
		emp.addEmployee(e);
		
		
		Employee e1=new Employee();
		e1.setEmpId(21277);
		e1.setEmpName("Ganesh");
		e1.setEmpSalary(4500);
		emp.addEmployee(e1);
		
		
		emp.displayEmployees();
	
		emp.deleteEmployee(e);
		
		System.out.println("21276 employee is removed");
		emp.displayEmployees();
		
		
		System.out.println(e1.getEmpName()+" year salary is: "+emp.yearSalary(e1));
	}

}
