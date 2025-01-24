package javaSelenium;

import java.util.Iterator;

public class SevenPrintEvenNumbers {

	public static void main(String[] args) {
		
		// To print list of even numbers from 0 to 20
		//0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
		
		int evenNumber = 20;
		for (int i = 0; i <=evenNumber; i++) {
			//if (i%2==0)
			if(i%2!=1)
			{
				System.out.println("The Even Numbers are "+i);
			}
		}

	}

}
