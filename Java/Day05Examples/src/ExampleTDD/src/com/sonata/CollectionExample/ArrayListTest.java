package ExampleTDD.src.com.sonata.CollectionExample;

import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.TestCase;
public class ArrayListTest {	

	@Test
	public void testAdd(){
		ArrayListDemo arrobj1=new ArrayListDemo();
		arrobj1.add(1);
		arrobj1.add(2);
		arrobj1.add(3);
		arrobj1.add(4);
		arrobj1.add(5);
		arrobj1.add(6);

		int size=arrobj1.getSize();
		System.out.println(size);
		assertEquals(6,size);
	}
   
	@Test
	public void testDelete(){
		ArrayListDemo arrobj2=new ArrayListDemo();
		arrobj2.add(10);
		arrobj2.add(20);
		arrobj2.add(30);
		arrobj2.add(40);

		arrobj2.delete(0);
		arrobj2.delete(1);
		arrobj2.delete(0);
		int size=arrobj2.getSize();
		System.out.println(size);
		assertEquals(2,size);
	}

	/*public void testisEmpty()
	{
		ArrayListDemo arrobj3=new ArrayListDemo();
		
		int size=arrobj3.getSize();
		System.out.println(size);
		assertEquals(0,size);
	}

	public void testLarge()
	{
		ArrayListDemo arrobj4=new ArrayListDemo();
		arrobj4.add(11);
		arrobj4.add(9);
		arrobj4.add(30);
		arrobj4.add(14);
		arrobj4.add(5);
		arrobj4.add(61);

		assertEquals(61,arrobj4.findLarge());
	}*/
	
}
