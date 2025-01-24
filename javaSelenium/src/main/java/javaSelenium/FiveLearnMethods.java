package javaSelenium;

public class FiveLearnMethods {
	//Methods and its Return Types
	
	//void - no return type
	public void browserName() {
	System.out.println("Browser Name");
	
}

	//returns data type
	//Access modifier - protected
	protected int addNumber(int a, int b) {
		return a+b;
		
	}
	
	//return type - primitive and non primitive datatype
	//Access modifier - default
	String employeeDetails(String name, int rollNo) {
		return name+""+rollNo;


	}
	
	//Access modifier - private
	//return type - void, does not return
	private void privateModifier() {
		System.out.println("This is a private modifier");
	}
	
	public static void main(String[] args) {
		FiveLearnMethods objName = new FiveLearnMethods();
		objName.browserName();
		objName.privateModifier();
		
		//type 1 - for returnType only
		System.out.println(objName.addNumber(10, 20));
		
		
		//type 2 - ctrl+2
		String employeeDetails = objName.employeeDetails("Arshad ",33);
		System.out.println(employeeDetails);
		
		
		
	}
	
	
}