package abstraction;

		//This is an abstract class
		// abstract class will not force to implement all methods at the same time

public abstract class Countries3 implements World1 {
	
	//Keep the cursor on the interface class name (World1) - Right Click - Source - Override/Implement Methods
	//select only required method to implement

	@Override
	public void dubai() {
		System.out.println("My first option");
		
	}

	@Override
	public void USA() {
		System.out.println("My second option");
		
	}
	
	//Adding this method in this class
	public void qatar() {
		System.out.println("This is new option");

	}
	
	//in abstract class, there should be one abstract method
	public abstract void richestCountries();
	
	
	
		public static void main(String[] args) {
			
			//We cannot create an object for the Abstract class also
			//Countries3 obj = new Countries3();
		}
	
	
	

}
