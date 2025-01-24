package javaSelenium;

public class SixLearnMethodsAccessModifier {

	public static void main(String[] args) {
		FiveLearnMethods obj = new FiveLearnMethods();
		System.out.println(obj.addNumber(30, 40));
		
		//No need to add sysout statement here as it is already added in the previous method
		obj.browserName();
		
		
		String employeeDetails = obj.employeeDetails("Aathif ", 005);
		System.out.println(employeeDetails);

	}

}
