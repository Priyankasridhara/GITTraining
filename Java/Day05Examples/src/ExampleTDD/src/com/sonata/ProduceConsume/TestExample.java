package ExampleTDD.src.com.sonata.ProduceConsume;

public class TestExample {

	public static void main(String[] args) {
		CubbyHole c = new CubbyHole();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		// There is no inter-thread communication
		p1.start();
		c1.start();
		
	}

}
