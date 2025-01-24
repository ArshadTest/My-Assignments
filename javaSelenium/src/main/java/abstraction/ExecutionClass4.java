package abstraction;

public class ExecutionClass4 extends Countries3{

	@Override
	public void india() {
		System.out.println("India");
		
	}

	@Override
	public void richestCountries() {
		System.out.println("The richest country - Dubai");
		
		
	}
	
	public static void main(String[] args) {
		ExecutionClass4 obj = new ExecutionClass4();
		obj.india();
		obj.richestCountries();
		obj.USA();
		obj.qatar();
		obj.dubai();
	
	}
}
