package javaSelenium;

public class FourLearnJumpStatements {

	public static void main(String[] args) {
		
		// break - Stops the loop or the execution, exit the loop permanently
		
		int number = 10;
		for (int i = 0; i <=10; i++) {
			if (i==8) {
				System.out.println("Break the execution on 8 "+i); // To show for an example, does not require print statement here
				
				break;
				
			}
			System.out.println(i);
		}
		
		System.out.println("************************************************************************");	
		
		// jump - Skips/Stops the current code and continue the loop
		
		int data = 13;
		for (int i = 0; i <=13; i++) {
			if (i==10) {
				System.out.println("Skip the bug and proceed "+i);  // To show for an example, does not require print statement here
				continue;
			}
			System.out.println(i);
			
		}
		
		
	}

}
