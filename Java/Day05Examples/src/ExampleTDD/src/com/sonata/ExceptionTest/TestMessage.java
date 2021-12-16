package ExampleTDD.src.com.sonata.ExceptionTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;

public class TestMessage {
  
	 String message ="Sonata";
	 
	  MessageException mE = new MessageException(message);
	  
	  @Test(expected = ArrayIndexOutOfBoundsException.class )
	  
	   public void testprintMessage(){
		  System.out.println("Inside the PrintMessage");
		  mE.printMessage();
	  }
	  
	  @Ignore
	  @Test
	  public void testaddMessage(){
		  System.out.println("Inside add Message");
		  //message = "Hi" + message;
		  assertEquals(message,mE.addMessage());
	  }  
  	
}
