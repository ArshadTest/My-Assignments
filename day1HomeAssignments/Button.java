package week3.day1HomeAssignments;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Submit");

	}
	public static void main(String[] args) {
		Button first=new Button();
		first.click();
		first.setText("Arshad");
		first.submit();
	}
}
