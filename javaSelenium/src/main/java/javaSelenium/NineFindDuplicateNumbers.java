package javaSelenium;


import java.util.Arrays;
import java.util.Iterator;

public class NineFindDuplicateNumbers {

	public static void main(String[] args) {
		int values[] = {15, 18, 18, 32, 65, 32, 45, 15};
		
		//use two for loop for this - nested loop
		//j=i+1 - 
		
		for (int i = 0; i < values.length; i++) {
			
		
		for (int j = i+1; j < values.length; j++) {
			
			if (values[i]==values[j]) {
				
				System.out.println("The duplicate numbers are "+values[j]); //i or j
				
			}
			
		}
		}
		
		System.out.println("********************************************");
		
		// Another method by using the single - for loop
		Arrays.sort(values);
		//After sort, values = {15,15 18,18,32,32,45,65 };
		for (int i = 0; i < values.length-1; i++) {  //use length-1 to end
			if (values[i]==values[i+1]) {
				System.out.println(values[i]); //use i or i+1
				
			}
		}
		
	}

}
