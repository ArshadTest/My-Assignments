package polymorphism;
	//1. Static Polymorphism / Compile-time Polymorphism / Early Binding [OR] Method Overloading
	//In the same Class, Multiple method of same name with different input argument

public class MethodOverloading {
	public void browser(String name) {
		System.out.println("The browser name is "+name);
	}
	
	public void browser(int version, String name) {
		System.out.println("The version is "+version+" The name is "+name);
	}
		public void browser(String name, int version) {
			System.out.println("The 2nd browser name is "+name+" The version is "+version);
		}
		public void browser(int a, int b) {
			System.out.println("The browser a is "+a+" The browser b is "+b);
		}
		
		public static void main(String[] args) {
			MethodOverloading ol = new MethodOverloading();
			ol.browser("Chrome");
			ol.browser(123, "Safari");
			ol.browser("FireFox", 121);
			ol.browser(10, 20);
		}
}
