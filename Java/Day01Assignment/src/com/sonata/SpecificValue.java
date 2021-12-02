package com.sonata;

public class SpecificValue {
	public static void main(String[] args) {
	int[] num = {3, 21, 3, 14, 54};
    int toFind = 33;
    boolean found = false;

    for (int n : num) {
      if (n == toFind) {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");

}
}
