package com.sonata;

public abstract class Shape {
	
	private String name;

	  

	  public Shape(String name) {
	    this.name = name;
	  }

	  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {}
	public abstract float getArea();
	public static void printShapeDetails(Shape[] list) {
	    for (int i = 0; i < list.length; i++) {
	    	String name = list[i].getName(); 
	        float area = list[i].getArea();
	        System.out.println("Name: " + name);
	        System.out.println("Area: " + area);
	    }
	}

     public static void main(String[] args) {
			  Shape[] shapeList = new Shape[3];
			   shapeList[0] = new Rectangle(2.0f, 4.0); 
			   shapeList[1] = new Square(5.0f);
			   shapeList[2]=new Triangle(2.0f,4.0f);

		  }
	}
	
	
	


