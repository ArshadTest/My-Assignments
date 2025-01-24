package javaSelenium;

import java.util.Arrays;
import java.util.Iterator;

public class FinalPractise {

	public static void main(String[] args) {
		

		 int numbers[] = {15,12,15,23,20,12,19,18,20,19}; 
		 
		 int length = numbers.length;
		 System.out.println(length);
		 
		 System.out.println(numbers[0]);
		 
		 System.out.println(numbers[length-1]);
		 
		 System.out.println("************************************");	 
		 
		 		
		String name[] = {"Arshad", "Shaziya", "Shahzeen", "Aathif"};
		int length1 = name.length;
		System.out.println(length1);
		
		System.out.println(name[length1-1]);
		
		System.out.println("***********************************");
		
		// To find the duplicate values
		
		int duplicateValues[] = {15,12,15,23,20,12,19,18,20,19}; 
		Arrays.sort(duplicateValues);
		
		for (int i = 0; i <duplicateValues.length-1; i++) {
			
			if (duplicateValues[i]==duplicateValues[i+1]) {
				
			System.out.println(duplicateValues[i]);
				
				
			}

			}
		
		//To find if the given number is an Even number
		int evenNumber = 20;
		if (evenNumber%2==0) {
			System.out.println("This is even number "+evenNumber);
			
		} else {
			System.out.println("Not an even number");
		}
			
		// To print all the event numbers till 20
		int printEvenNumbers = 20;
		for (int i = 0; i <=printEvenNumbers; i++) {
			if (i%2!=1) {
				System.out.println("The even numbers are "+i);
			} 
			
		}
		
		}	
		
		
	}

