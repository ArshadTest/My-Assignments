package inheritance;

public class BikeP extends VehicleGP {
		public void petrolMileage() {
			System.out.println("The mileage is 50");
		}
		
		public static void main(String[] args) {
			BikeP obj = new BikeP();
			obj.petrolMileage();
			obj.speedTest();
			obj.airBag();
		}
}
	