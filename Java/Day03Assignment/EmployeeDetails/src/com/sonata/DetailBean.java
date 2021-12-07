package com.sonata;



public class DetailBean extends Employee {
	public static void main(String[] args) {
		Address a1= new Address();
		a1.setCity("Banglore");
		a1.setDoorNo("529");
		a1.setStreet("70th cross");
		a1.setZip("560078");
		
		Address a2= new Address();
		a1.setCity("Banglore");
		a1.setDoorNo("529");
		a1.setStreet("70th cross");
		a1.setZip("560078");
		
		TechnicalEmployee t1= new TechnicalEmployee();
		t1.setName("Priyanka");
		t1.setEmployeeID(21276);
		t1.setNoOfleaveAvailable(10);
		t1.setObj(a1);
		
		Staff s1=new Staff();
		s1.setEmployeeID(21277);
		s1.setName("Deepthi");
		s1.setNoOfleaveAvailable(5);
		s1.setObj(a2);
		System.out.println(s1);
		
		
	}


}
