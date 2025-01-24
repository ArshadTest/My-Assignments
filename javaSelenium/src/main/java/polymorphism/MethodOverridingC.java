package polymorphism;

public class MethodOverridingC extends MethodOverridingP {
	
	public void seatingCapacity() {
		System.out.println("The seating Capacity is 5");  // It overrides and prints this statement/logic
	}
	
	public static void main(String[] args) {
		MethodOverridingC obj = new MethodOverridingC();
		obj.seatingCapacity();
	}
}
