package com.sonata;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name ="Employee_Details")
public class Employee {
	@Id	
	@Column(name ="Employee_Id")
  private int empId;
	@Column(name ="Employee_Name")
  private String empName;
	@Column(name = "Employee_Salary")
  private double empSal;	
	@Transient //don't save as a column in database
	private String password;
	@Column(nullable = false) // not null constraint
	private String emailAdd;
	@Basic //default column
	private boolean isPerm;
	@Temporal(TemporalType.DATE)//time format details
	private Calendar joinDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date empLogin;
  
  
public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public boolean isPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	public Calendar getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Calendar joinDate) {
		this.joinDate = joinDate;
	}
	public Date getEmpLogin() {
		return empLogin;
	}
	public void setEmpLogin(Date empLogin) {
		this.empLogin = empLogin;
	}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
@Column(name ="Employee_Name")
public String getEmpName() {
	return empName + "From getter";
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}
  
  
  
}
