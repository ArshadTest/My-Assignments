package abstraction;

	//This is a concrete class

public class Countries2 implements World1{
	
	public void india() {
		System.out.println("India");
	}
	
	
	@Override
	public void dubai() {
		System.out.println("Dubai");
		
	}

	//it added later
	@Override
	public void USA() {
		
		
	}
	
	public static void main(String[] args) {
		Countries2 obj = new Countries2();
		obj.india();
		obj.dubai();
		

	}



}
