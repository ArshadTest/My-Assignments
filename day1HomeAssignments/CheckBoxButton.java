package week3.day1HomeAssignments;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("Click Check Button");
	}
	public static void main(String[] args) {
		CheckBoxButton third=new CheckBoxButton();
		third.submit();
		third.clickCheckButton();
	}
}
