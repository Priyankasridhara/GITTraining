package com.sonata;

public class Developer extends Employee  {
	public double salCal(){
		return empId;}
	Developer(){}
	Developer(int i, String n, double s){
		super(i,n,s);
		
	}
	public double salCal(double DA) {
		double total=super.salCal(DA)+20000;
		return total;
		
	}
	public static void main(String[] args) {
		Developer d1= new Developer(2124,"Manu",45000);
		System.out.println(d1.salCal(3000));
		d1.display();
	}

}
