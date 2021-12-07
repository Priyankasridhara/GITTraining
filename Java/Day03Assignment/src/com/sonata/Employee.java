package com.sonata;

public class Employee {
	int empId;
	String empName;
	double empSal;
	
	public double salCal(){
		return empId;}
	//Manager ,Developer, Tester 
	//Create an Employee class with below properties and methods empId, empName,empSal and public void display(){} ,  
	//public void salCal(){} implement the inheritance & polymorphism functionality for Manager ,Developer, Tester class 
    //override the SalCal function. 
	
public Employee(int i, String n, double s) {
		
		this.empId=i;
		this.empName=n;
		this.empSal=s;
	}
	public Employee() {
	// TODO Auto-generated constructor stub
}

	public double salCal(double HRA, double DA) {
		double total=this.empSal+HRA+DA;
		return total;
		
	}
	public void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
	}

	public double salCal(double dA) {
		// TODO Auto-generated method stub
		return (int) dA;
	}

}
