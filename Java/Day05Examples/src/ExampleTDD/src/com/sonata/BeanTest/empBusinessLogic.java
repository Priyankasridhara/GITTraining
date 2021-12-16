package ExampleTDD.src.com.sonata.BeanTest;

public class empBusinessLogic implements empIntf{
    
	public double yearSalary(empDetails e1){
		double ySalary =0;
		 ySalary = e1.getSalary()*12;
		 return ySalary;
	}
	
	public double appSalary(empDetails e1){
		double appraisal =0;
		
		if(e1.getSalary()<10000){
			appraisal = 5000;
		}else{
			appraisal = 1000;
		}
		return appraisal;
	}
}
