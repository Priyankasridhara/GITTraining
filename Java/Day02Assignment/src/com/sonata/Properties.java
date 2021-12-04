package com.sonata;

public class Properties {
	//ProID, ProName, ProPrice display the information and ProPrice will be added additional tax of GST . 
int proID;
String proName;
int proPrice;
public double totalPrice(float GST) {
	 double total=this.proPrice+GST*this.proPrice;
	 return total;
 }
public void display() {
	System.out.println("Property name:"+proName);
	System.out.println("Property ID:"+proID);
	System.out.println("Property price:"+proPrice);
	
}
public static void main(String arg[]) {
	Properties p1=new Properties();
	p1.proID=1233;
	p1.proName="Anatha";
	p1.proPrice=600000;
	p1.display();
	System.out.println("The total price of the proertie is: " +p1.totalPrice(0.2f));
}
	
}
