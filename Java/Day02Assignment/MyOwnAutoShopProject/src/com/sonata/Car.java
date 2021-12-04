package com.sonata;

public class Car {
	
	int speed; 

	double regularPrice; 

	String color; 
	
public Car() {}
	
	public Car(int s, double r, String c) {
		this.speed=s;
		this.regularPrice=r;
		this.color=c;
		getSalePrice();
	}
	public Car(int s, double r, String c,int i,int j) {
		this.speed=s;
		this.regularPrice=r;
		this.color=c;
		getSalePrice();
	}
	public Car(int s, double r, String c,int l) {
		this.speed=s;
		this.regularPrice=r;
		this.color=c;
		getSalePrice();
	}
	double getSalePrice() {
		double price=this.regularPrice;
		return price;
	}
	void display() {
		
		
		
	};
	public static void main(String[] args) {
		Sedan s1 = new Sedan(100, 2678000,"black", 10);
		Ford f1 = new Ford (156,445200.0,"blue",2020, 10);
		Ford f2 = new Ford (216,512600.0,"red",2021, 5);
		Car c1 = new Car (555, 5685600.0, "white");
		System.out.println("The Sedan price of s1: ₹"+s1.getSalePrice());
		System.out.println("The Ford  price of f1: ₹ "+f1.getSalePrice());
		System.out.println("The Ford  price of f2: ₹"+f2.getSalePrice());
		System.out.println("The Car  price of c1: ₹"+c1.getSalePrice());
	

}
}