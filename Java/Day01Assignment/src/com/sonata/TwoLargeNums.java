package com.sonata;

public class TwoLargeNums {
	 public static void main(String a[]){
	 int num[] = {51,3,48,12,54,100,909,23};
	 int numOne = 0;
     int numTwo = 0;
     for(int n:num){
         if(numOne < n){
             numTwo = numOne;
             numOne =n;
         } else if(numTwo < n){
             numTwo = n;
         }
     }
     System.out.println("First Largest Number: "+numOne);
     System.out.println("Second Largest Number: "+numTwo);
 }

}
