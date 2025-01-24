package selenium1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OneLearnList {

	public static void main(String[] args) {
				List<String> name = new  ArrayList<String>();
				
				
				//List Methods
				//m1 add
				name.add("Arshad");
				name.add("Aathif");
				name.add("Shahzeen");
				name.add("Arshad");
				name.add("Shaziya");
				
				System.out.println(name);
				
				//1.get length
				int size = name.size();
				System.out.println(size);
				
				//2.add a name khan in 5th place, cannot do this in a Array
				name.add(3, "Amaan");
				name.add(2, "Khan");
				System.out.println(name);
				
				//3.contains - it is case sensitive
				boolean contains = name.contains("Shahzeen");
				System.out.println(contains);
				
				//4.remove
				String remove = name.remove(4);
				System.out.println(remove);
				System.out.println(name);
				
				//5.sort - use collections
				Collections.sort(name);
				System.out.println(name);
				
				//6. print data in the console - get()
				String string = name.get(2);
				System.out.println(string);
				
				for (int i = 0; i < name.size(); i++) {
					System.out.println(name.get(i));
				}
				
				//7. clear method
				name.clear();
				System.out.println(name);
				
				//Print name after clearing it, will show error
				String string2 = name.get(2);
				System.out.println(string2);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
