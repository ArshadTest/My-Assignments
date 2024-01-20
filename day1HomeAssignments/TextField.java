package week3.day1HomeAssignments;

public class TextField extends WebElement {
	
	public void getText() {
		System.out.println("Get the text");

	}
	public static void main(String[] args) {
		TextField second=new TextField();
		second.click();
		second.setText("Aathif");
		second.getText();
	}
}
