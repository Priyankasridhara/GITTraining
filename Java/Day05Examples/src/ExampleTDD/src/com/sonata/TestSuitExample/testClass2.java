package ExampleTDD.src.com.sonata.TestSuitExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testClass2 {
	
	String message = "Robert";	
	   MessageClass messageUtil = new MessageClass(message);
	 
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message =  "Hi!" + "Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }

}
