package com.sonata;

public class StudentDetails {
	//stdID , stdName, stdClass and display the information of two objects 
int stdID;
String stdName;
int stdClass;
public void display() {
	System.out.println("Student  name:"+stdName);
	System.out.println("Student  ID:"+stdID);
	System.out.println("Student  marks:"+stdClass);
	}
	public static void main(String arg[]) {
		StudentDetails s1=new StudentDetails();
		s1.stdName="Shilpa";
		s1.stdID=212;
		s1.stdClass=7;
		s1.display();
		
		StudentDetails s2=new StudentDetails();
		s2.stdName="Deepa";
		s2.stdID=213;
		s2.stdClass=8;
		s2.display();
	
} 
}
