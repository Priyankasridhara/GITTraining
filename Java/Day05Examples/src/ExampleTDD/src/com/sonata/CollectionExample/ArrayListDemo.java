package ExampleTDD.src.com.sonata.CollectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

   ArrayList arr = new ArrayList();   
    
   public void add(int element){
	   arr.add(element);
   }
    public void delete(int element){
	   arr.remove(element);
   }
    int getSize()
	{
		return arr.size();
	}
   /*  boolean isEmpty()
	{
		boolean k=false;
		if(arr.isEmpty())
			k=true;
		return k;
	}

	

	int findLarge()
	{
		int max;
		Iterator it=arr.iterator();
		
		max=(Integer)it.next();
		while(it.hasNext())
		{
			int element=(Integer)it.next();
			if(max<element)
				max=element;
			
		}
		return max;
	}	*/	

}














