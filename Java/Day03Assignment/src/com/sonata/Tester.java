package com.sonata;

public class Tester extends Employee {
	
	
	
	Tester(int i, String n, double s){
		super(i,n,s);
		
	}
	public double salCal() {
		double total=super.salCal()+2000;
		return total;
		
	}
	public static void main(String[] args) {
		Tester t1= new Tester(2124,"Divya",40000);
		System.out.println(t1.salCal());
		t1.display();
	}



}
