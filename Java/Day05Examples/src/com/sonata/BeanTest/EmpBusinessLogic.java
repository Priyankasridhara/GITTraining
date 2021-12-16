package com.sonata.BeanTest;

public class EmpBusinessLogic implements empIntf{
    
	public double yearSalary(EmpDetails e1){
		double ySalary =0;
		 ySalary = e1.getSalary()*12;
		 return ySalary;
	}
	
	public double appSalary(EmpDetails e1){
		double appraisal =0;
		
		if(e1.getSalary()<10000){
			appraisal = 5000;
		}else{
			appraisal = 1000;
		}
		return appraisal;
	}
}