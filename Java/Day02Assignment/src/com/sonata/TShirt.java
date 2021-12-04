package com.sonata;

public class TShirt {
//Create three instances of object based on different sizes like small, large , extra-large. 
String color ;
String material; 
String design ;
String size;


public void display() {
	System.out.println("TShirt color:"+color);
	System.out.println("TShirt material:"+material);
	System.out.println("TShirt design:"+design);
	System.out.println("TShirt size:"+size);
	
	
}
public static void main(String arg[]) {
	TShirt t1=new TShirt();
	TShirt t2=new TShirt();
	TShirt t3=new TShirt();
	t1.color="Blue";
	t1.material="Cotton";
	t1.design ="Shirt";
	t1.size="small";
	t2.size="large";
	t3.size="extra-large";
	t1.display();
	t2.display();
	t3.display();
	
	
}
	


}
