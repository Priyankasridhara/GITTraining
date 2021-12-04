package com.sonata;

public class Truck extends Car {
	int weight;
	Truck(int s,double r,String c){
		super(s,r,c);
	}
	
	double getSalePrice() {
		if(weight>2000) {
			float salePrice=(float) (this.regularPrice+this.regularPrice*0.1f);
			return salePrice;
		}
		else {
			
			float salePrice=(float) (this.regularPrice+this.regularPrice*0.1f);
			return salePrice;
		}
		
	};
	// If weight > 2000, 10% discount. Otherwise, 20% discount. 

}
