package com.sonata;

public class Sedan extends Car {
	int length; 
	Sedan(int s,double r,String c,int l){
		super(s,r,c,l);
	}

	double getSalePrice() {
		if(length>20) {
			float salePrice=(float) (this.regularPrice-this.regularPrice*0.005f);
			return salePrice;
		}
		else {
			float salePrice=(float) (this.regularPrice-this.regularPrice*0.01f);
			return salePrice;
			
		}
	};
	// If length > 20 feet, 5% discount, Otherwise, 10% discount. 


}
