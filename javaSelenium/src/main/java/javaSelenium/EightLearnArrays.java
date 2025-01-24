package javaSelenium;

//Number 1

import java.util.Arrays;
	
public class EightLearnArrays {
	public static void main(String[] args) {
		String name [] = {"Arshad", "Shaziya", "Shahzeen", "Aathif"};
		
		//To find the length
		//Assign to Local variable ctrl+2, L
		int length = name.length;
		System.out.println(length);
		
		//print - Arshad
		System.out.println(name[0]);
		
		//print last value in the Array, so length-1
		System.out.println(name[length-1]);
		
		
		//Sort - To Sort - use Arrays.sort
		//After sorting - {Aathif, Arshad, Shahzeen, Shaziya}
		Arrays.sort(name);
		System.out.println(name[3]);
		
		System.out.println("************************************");
		
		
		//To print all mentors, should use loop only
		for (int i = 0; i <name.length; i++) {
			System.out.println(name[i]);
		}
		
		
		
	}
	
} 
