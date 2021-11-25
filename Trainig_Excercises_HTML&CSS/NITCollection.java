class NITCollection{
	private Object[] arrayObj = new Object[10];
	private int elementCount = 0;

	public void add(Object obj){
		if(elementCount==arrayObj.length){
			increaseCapacity();
		}
		arrayObj[elementCount] = obj;
		elementCount++;
	}

	//Increasng Object array and adding new obj array to old arrayobj
	public void increaseCapacity(){
		int capacity = arrayObj.length*2;
		Object[] newArray = new Object[capacity];

		for(int i=0;i<newArray.length;i++){
			newArray[i] = arrayObj[i];
		}
		newArray=arrayObj;
	}

	public int capacity(){
		return arrayObj.length;
	}

	public int size(){
		return elementCount;
	}
	public Object get(int index){
		if(index<0||index>=size()){
			System.out.println("Plz Enter valid index number...");
		}
		return arrayObj[index];
	}
	public void replace(int index,Object obj){
		if(index<0||index>=size()){
			System.out.println("Plz Enter valid index number...");
		}
		arrayObj[index] = obj;
	}
}