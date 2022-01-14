package com.sonata;

import java.util.ArrayList;

public  class Employee {
	int EmployeeID ;

	String EmployeeName ;

	double EmployeeSalary ;


	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int i, String string, double j) {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + "]";
	}

	public double yearSalary(double salary) throws Exception {
		// TODO Auto-generated method stub
		return salary ;
	}

	public void displayData(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		
	}
	

}
