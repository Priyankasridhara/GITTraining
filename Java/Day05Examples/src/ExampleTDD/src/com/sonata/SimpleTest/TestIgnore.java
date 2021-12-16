package ExampleTDD.src.com.sonata.SimpleTest;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


public class TestIgnore {
	
	 Message a1 = new Message();
		//@Ignore 
		@Test  
		public void testAdd(){
			System.out.println("inside add method");
		 int x=	a1.add(10,12);
		 assertEquals(22,x);
		}
		
		 @Ignore
		@Test 
		public void testSub(){
			System.out.println("inside sub method");
			int y = a1.sun(30,20);
			assertEquals(10,y);
		} 

}
