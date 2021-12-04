package com.sonata;

public class Ford extends Car {
	int year; 

	int manufacturerDiscount; 
	Ford(int s,double r,String c, int i, int j){
		super(s,r,c,i,j);
	}

	double getSalePrice() {
		float salePrice=(float) (this.regularPrice-this.manufacturerDiscount);
		return salePrice;
		
		
	};
	// From the sale price computed from Car class, subtract the manufacturerDiscount. 
}
