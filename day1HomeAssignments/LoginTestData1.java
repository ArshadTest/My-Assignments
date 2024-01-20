package week3.day1HomeAssignments;

public class LoginTestData1 extends TestData {
	public void enterUsername() {
		System.out.println("Username");
	}
	public void enterPassword() {
		System.out.println("EnterPassword");
	}
	
	public static void main(String[] args) {
		
	LoginTestData1 Data1=new LoginTestData1();
		Data1.enterCredentials();
		Data1.navigateToHomePage();
		Data1.enterUsername();
}
}