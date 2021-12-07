package com.sonata;

public class Square  extends Shape{
	private float length;
	  

	  public Square(float length) {
	    
	    super("Square");
	    this.length = length;
	   
	  }
	  public float getArea() {
		    return (float)(2* length);
		  }

}
