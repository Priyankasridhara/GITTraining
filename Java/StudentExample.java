package com.sonata.exmaple;
import java.util.ArrayList;
import java.util.List;

public class StudentExample extends Student  {

		   StudentExample(String n, int m) {
		super(n, m);
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
		      List<Student> studentlist = new ArrayList<Student>();
		      studentlist.add(new Student("John", 85)); 
		      studentlist.add(new Student("Steve", 79)); 
		      studentlist.add(new Student("Kevin", 53)); 
		      studentlist.add(new Student("Ron", 60)); 
		      studentlist.add(new Student("Lucy", 88));
		      System.out.println("Before Sorting the student data:"); 
		 
	
		      studentlist.forEach((s)->System.out.println(s));
		     
		      studentlist.sort((Student s1, Student s2)->s2.getMarks()-s1.getMarks());
		      
		      System.out.println("Before Sorting the student data:"); 
				 
		      studentlist.forEach((s)->System.out.println(s));

}
}
