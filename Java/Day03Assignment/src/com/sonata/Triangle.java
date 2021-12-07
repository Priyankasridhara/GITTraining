package com.sonata;

public class Triangle  extends Shape{
	private float breadth;
	  private float height;

	  public Triangle(float breadth, float height) {
	    
	    super("Triangle");
	    this.breadth = breadth;
	    this.height = height;
	  }
	  public float getArea() {
		    return (0.5f*breadth * height);
		  }

}
