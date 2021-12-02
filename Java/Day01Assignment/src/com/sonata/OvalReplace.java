package com.sonata;

public class OvalReplace {
	public static  void main(String args[]) {
		String str = "smile";  
        String rs ;
        rs= str.replace("a","$");   
        rs = rs.replace("e","$"); 
        rs = rs.replace("i","$");
        rs = rs.replace("o","$");
        rs = rs.replace("u","$");
        System.out.println("The replaced string is: "+rs);  
	}

}
