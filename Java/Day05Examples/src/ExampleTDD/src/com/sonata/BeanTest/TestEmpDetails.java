package ExampleTDD.src.com.sonata.BeanTest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class TestEmpDetails {
   empBusinessLogic elogic = new empBusinessLogic();
   empDetails emp = new empDetails();
   
   @Ignore
   @Test
   public void testappSalary(){
	   emp.setName("Rajesh");
	   emp.setAge(30);
	   emp.setSalary(100);
	   double appraisal= elogic.appSalary(emp);
	   System.out.println(appraisal);
	   assertEquals(1200,appraisal,1.0);
	   
   } 
     
   @Test
   public void testyearSalary(){
	   emp.setName("Rakesh");
	   emp.setAge(25);
	   emp.setSalary(8000);
	   double total=elogic.yearSalary(emp);
	   assertEquals(96000,total,0.0);
   }
}





