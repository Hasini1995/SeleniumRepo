package week3.day1.homeassignment;

public class Button extends WebElement{
	public void submit() {
		System.out.println("This is a Button subclass: submit.");
	}

	public static void main(String[] args) {
		Button sc=new Button();
		sc.click();
		sc.setText("Hello");
		sc.submit();
	}

}
