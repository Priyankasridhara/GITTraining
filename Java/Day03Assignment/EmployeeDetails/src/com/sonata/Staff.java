package com.sonata;

public class Staff extends Employee {
	private String name;
    private int employeeID;
    Address obj;
    void BasicPay(){}
    float NoOfleaveAvailable ;
	public Staff() {}
	public Staff(String HouseKeeping, String security) {}
	@Override
	public float calculateSalary(double basicPay,double HRA) {
		// TODO Auto-generated method stub
		float 	salary =(float) (( 1.2f*basicPay) + HRA) ;
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeID() {
		return employeeID;
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
		return "Staff [name=" + name + ", employeeID=" + employeeID + ", obj=" + obj + ", NoOfleaveAvailable="
				+ NoOfleaveAvailable + ", getName()=" + getName() + ", getEmployeeID()=" + getEmployeeID()
				+ ", getObj()=" + getObj() + ", getNoOfleaveAvailable()=" + getNoOfleaveAvailable() + ", toString()="
				+ super.toString() + ", calculateSalary()=" + calculateSalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
