package ExampleTDD.src.com.sonata.ProduceConsume;

public class CubbyHole {
	private int contents;
	private boolean available = false;
	
	public synchronized int get() {
		while (available == false) {
		try {
		    wait();
		} catch (InterruptedException e) { }
		}
		available = false;
		   notifyAll();
		return contents;
		}
	
	public synchronized void put(int value) {
		while (available == true) {
		try {
		   wait();
		} catch (InterruptedException e) { }
		}
		contents = value;
		available = true;
		 notifyAll();
		}

	
	
	
	
	 /* Get the data
	 public int get() {
	  return contents;
	 }*
	
	 // Place the data
	 public synchronized void put(int value) {
	   contents = value;
	 }*/
}
