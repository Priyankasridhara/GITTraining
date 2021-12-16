package ExampleTDD.src.com.sonata.SimpleTest;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCal {

	  CalClass calculation = new CalClass();
	
	    int sum = calculation.sum(2, 5);
	
	    int testSum = 7;	 
	
	    @Test
	
	    public void testSum() {
	
	        System.out.println("@Test sum(): " + sum + " = " + testSum);
	
	        assertEquals(sum, testSum);
	
	    }

}
