package com.sonata;



public class TestUsingPeople {
	public static void main(String[] args) {
		Address a1= new Address();
		a1.setCity("Banglore");
		a1.setPin(560078);
		a1.setState("KNA");
		
		UsingPeople u1=new UsingPeople();
		
		u1.setpName("Arpitha");
		u1.setObj(a1);
		System.out.println(u1);
	}

}
