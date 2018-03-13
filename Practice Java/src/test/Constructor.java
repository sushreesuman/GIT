package test;

public class Constructor {

	public static void main(String[] args) {

		Address1 obj = new Address1("Bangalore", "Karnataka", "India");
		System.out.println(obj.counter);
		Address1 obj2 = new Address1("Bangalore", "Karnataka", "India");
		System.out.println(obj2.counter);
		
		
		System.out.println(obj.counter);
		System.out.println(Address1.counter);
	
	}

}
