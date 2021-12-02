package com.sonata;

public class SumOfArrayElements {
	public static  void main(String args[]) {
		int sum1=0;
		int[] myArray=new int[6];
		myArray[0]=1;
		myArray[1]=2;
		myArray[2]=3;
		myArray[3]=4;
		myArray[4]=5;
		myArray[5]=6;
		for(int num:myArray) {
			sum1+=num;
			
		}
		System.out.println("sum of myArray is: "+ sum1);
	}
	
	

}
