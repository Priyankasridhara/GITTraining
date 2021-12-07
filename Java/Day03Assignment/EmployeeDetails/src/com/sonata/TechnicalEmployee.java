package com.sonata;

public  class TechnicalEmployee extends Employee {
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
	
	
	public float getNoOfleaveAvailable() {
		return NoOfleaveAvailable;
	}
	public void setNoOfleaveAvailable(float noOfleaveAvailable) {
		NoOfleaveAvailable = noOfleaveAvailable;
	}
	public TechnicalEmployee() {}
	public TechnicalEmployee(String C, String CPlusPlus,String Java) {}
	@Override
	public float calculateSalary(double basicPay,double HRA) {
		// TODO Auto-generated method stub
	float 	salary =(float) (( 1.2f*basicPay) + HRA) ;
		return salary;
	}
	@Override
	public String toString() {
		return "TechnicalEmployee [name=" + name + ", employeeID=" + employeeID + ", obj=" + obj
				+ ", NoOfleaveAvailable=" + NoOfleaveAvailable + ", getName()=" + getName()
				+ ", getNoOfleaveAvailable()=" + getNoOfleaveAvailable() + ", toString()=" + super.toString()
				+ ", getEmployeeID()=" + getEmployeeID() + ", calculateSalary()=" + calculateSalary() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	


}
