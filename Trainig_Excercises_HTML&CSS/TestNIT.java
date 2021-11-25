class TestNIT{
	public static void main(String[] args){
		NITCollection obj = new NITCollection();

		obj.add("Nani");

		System.out.println(obj.get(0));
		
		obj.replace(0,"Raju");
		System.out.println(obj.get(0));

		System.out.println(obj.capacity());

		System.out.println(obj.size());

	}
}