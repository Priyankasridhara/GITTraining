package com.sonata;

public class Manger extends Employee {
	Manger(){}
	Manger(int i, String n, double s){
		super(i,n,s);
		
	}
	public double salCal(double HRA, double DA) {
		double total=super.salCal(HRA, DA)+20000;
		return total;
		
	}
	public static void main(String[] args) {
		Manger m1= new Manger(2123,"Manoj",45679);
		System.out.println(m1.salCal(2000, 4000));
		m1.display();
	}

}
