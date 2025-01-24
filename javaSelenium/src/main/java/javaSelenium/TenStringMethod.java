package javaSelenium;

public class TenStringMethod {

	public static void main(String[] args) {
		//Type 1 - String Literal
		String name = "Ars had";
		
		//Type 2 - String instantiation
		String academy = new String ("Ars had");
		
		//To find the Length
		int length = name.length();
		System.out.println("The Lenght is "+length);
		
		//1.To convert as Uppercase
		String upperCase = name.toUpperCase();
		System.out.println("The uppercase letters are "+upperCase);
		
		//2. To convert as Lowercase
		String lowerCase = name.toLowerCase();
		System.out.println("The Lowercase letters are "+lowerCase);
		
		//3. equals
		//DB .equals() and == (Interview question)
		//.equal checks for String match
		
		if (name.equals(academy)) {
			System.out.println("The content is same .equals");
		} else {
			System.out.println("The content is not same");
		}
		
		//4. == checks for the memory allocation
		if (name==academy) {
			System.out.println("It is same ==");
		} else {
			System.out.println("It is not same ==");
		}
		
		//5. equalsignore case - It will check only the content and not case sensitive
		String capital = ("aRS HAD");
		if (name.equalsIgnoreCase(capital)) {
			System.out.println("Both Strngs are same");
		} else {
			System.out.println("They are not the same");

		}
		//6. contains - It should be in order or sequence of characters and it is case sensitive
		boolean contains = capital.contains("aRS");
		System.out.println("Contains "+contains);
		
		//7. toCharArray - use this when you iterate a string
		 String tool = "Selenium Webdriver";
		 char[] charArray = tool.toCharArray();
		 for (int j = 0; j < charArray.length; j++) {
			 System.out.println(charArray[j]);

		}
		
		 //8. charAt - The position used to print the character
		 char charAt = tool.charAt(4);
		 System.out.println("The position is "+charAt);
		
		//9.replace - Used to replace a particular character, it could be number, special char etc
		String replace = tool.replace('e', 'z');
		System.out.println("Replace the texts "+replace);
		
		//10. replaceAll - Used to replace more chars
		String replaceAll = tool.replaceAll("[S,e,r]", "Y");
		System.out.println("Replace some of the chars "+replaceAll);
		
		String framework = "TestNG2025";
		
		//replaces all chars from a-z
		String replaceAllz = framework.replaceAll("[a-z]", "@");
		System.out.println("Replace some of the chars "+replaceAllz);
		
		//replaces all chars except a-z
		String replaceAllx = framework.replaceAll("[^a-z]", "@");
		System.out.println("Replace some of the chars "+replaceAllx);
		
		//11. subString - prints from the mentioned place value - index number
		// This is an example for Method Overloading - Two same method name with different input arguments
		String car = "EcoSport";
		String substring = car.substring(3);
		System.out.println(substring);
		
		//It prints from 2 and till 4, but not 5
		String substring1 = car.substring(2, 5);
		System.out.println(substring1);
		
		//12. split - To remove the space inbetween the texts - Interview question
		String aim = "I will become an automation engineer in 2025";
		String[] split = aim.split(" ");
		//System.out.println(split);
		//The above code only show memory address, so use for loop
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]); 	//remove ln in println to avoid printing in new line and to print in the same line
		}
		
		System.out.println("*******************************");
		
		//String reverse - Interview question
		//use toCharArray to iterate the string
		String aim1= "Automation Engineer";
		char[] charArray2 = aim1.toCharArray();
		
		//use for loop to reverse String
	
		for (int i = charArray2.length-1; i>=0 ; i--) { 	//use decrement operator to reverse (To print from the end)
			System.out.print(charArray2[i]);	//remove ln to print in the same line
		}
		
		
		
	}

}
