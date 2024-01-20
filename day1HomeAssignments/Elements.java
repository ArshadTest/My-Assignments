package week3.day1HomeAssignments;

public class Elements extends Button {
	
	public void test() {
		System.out.println("This is Execution");
	}
	public static void main(String[] args) {
		Elements executionclass=new Elements();
		executionclass.click();
		executionclass.setText("Arshad");
		executionclass.submit();
		executionclass.test();
	}
}
