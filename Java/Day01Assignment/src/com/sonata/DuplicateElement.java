package com.sonata;

public class DuplicateElement {
	public static  void main(String args[]) {
		int [] arr = new int [] {1, 1, 3, 4, 2, 4, 8, 8, 3};   
        System.out.println("Duplicate elements in  the given array: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j]) {
                    System.out.println(arr[j]);}  
                }
	
}
}
}