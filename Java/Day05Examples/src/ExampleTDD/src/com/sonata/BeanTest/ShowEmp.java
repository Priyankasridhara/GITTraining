package ExampleTDD.src.com.sonata.BeanTest;

public class ShowEmp {

	public static void main(String[] args) {
		
		 empBusinessLogic elogic = new empBusinessLogic();
		   empDetails emp = new empDetails();
		   
		   emp.setName("Rajesh");
		   emp.setAge(30);
		   emp.setSalary(100);
		   double appraisal= elogic.appSalary(emp);
		   System.out.println(appraisal);
		   
		   emp.setName("Rakesh");
		   emp.setAge(25);
		   emp.setSalary(8000);
		   double total=elogic.yearSalary(emp);
		   System.out.println(total);
	}

}
