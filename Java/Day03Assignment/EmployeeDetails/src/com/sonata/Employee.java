package com.sonata;

public  class Employee {

    private String name;
    private int employeeID;
   Address obj;
    void BasicPay(){}
    float NoOfleaveAvailable ;
    
    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public Address getObj() {
		return obj;
	}


	public void setObj(Address obj) {
		this.obj = obj;
	}


	public float getNoOfleaveAvailable() {
		return NoOfleaveAvailable;
	}


	public void setNoOfleaveAvailable(float noOfleaveAvailable) {
		NoOfleaveAvailable = noOfleaveAvailable;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeID=" + employeeID 
				+ ", NoOfleaveAvailable=" + NoOfleaveAvailable + ", getName()=" + getName() + ", getEmployeeID()="
				+ getEmployeeID()  + ", getNoOfleaveAvailable()="
				+ getNoOfleaveAvailable() + ", calculateSalary()=" + calculateSalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	 public float calculateSalary();

	public float calculateSalary(double basicPay, double HRA) {
		// TODO Auto-generated method stub
		return NoOfleaveAvailable ;
	}

    
}