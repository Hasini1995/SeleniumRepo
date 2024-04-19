package week3.day1.homeassignment;

public class TextField extends WebElement {
	public void getText() {
		System.out.println("This is a TextField subclass: getText.");
	}
	public static void main(String[] args) {
		TextField sc1=new TextField();
		sc1.click();
		sc1.setText("Subclass");
		sc1.getText();

	}

}
