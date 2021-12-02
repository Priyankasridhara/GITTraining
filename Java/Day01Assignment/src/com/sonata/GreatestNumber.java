package com.sonata;

public class GreatestNumber {
	public static  void main(String args[]) {

			int arr[] = {12,25,89};
				int i;
				int max = arr[0];
				for (i = 1; i < arr.length; i++) {
					if (arr[i] > max)
						max = arr[i];
					
				
			}System.out.println("The largest num is: "+max);
	}
}
		

