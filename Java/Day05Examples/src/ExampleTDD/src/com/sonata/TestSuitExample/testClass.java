package ExampleTDD.src.com.sonata.TestSuitExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testClass {
	String message = "Robert";	
	String message1 = "Sonata";
	   MessageClass messageUtil = new MessageClass(message);
	   
	   @Test
	   public void PrintMessage() {	
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals(message1, messageUtil.printMessage());     
	   }
}
