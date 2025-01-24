package inheritance;

public class BulletC extends BikeP {
	public void cubicCapacity() {
		System.out.println("Cubic Capacity is 350");
	}
	
	public static void main(String[] args) {
		BulletC obj = new BulletC();
		obj.cubicCapacity();
		obj.airBag();
		obj.speedTest();
		obj.petrolMileage();
	}
}
