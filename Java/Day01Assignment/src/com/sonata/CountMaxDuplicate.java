package com.sonata;

public class CountMaxDuplicate {
	public static void main(String[] args) {
	int [] arr = {4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};
	int maxCounter = 0;
	 int element=0;
	 for (int i = 0; i <arr.length ; i++) {
	 int counter =1;
	 for (int j = i+1; j <arr.length ; j++) {
	 if(arr[i]==arr[j]){
	 counter++;
	 }
	 }
	 if(maxCounter<counter){
	 maxCounter=counter;
	 element = arr[i];
	 }
	 }
	 System.out.println("Maximum  Duplicate no " + element + "  has maximum count of : " + maxCounter);

}
}
