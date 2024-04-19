package week3.day1.homeassignment;

public class WebElement {
	public void click() {
		System.out.println("This is a base class : click.");
	}
	public void setText(String text) {
		System.out.println("This is a base class : String."+ " "+ text);
		
	}

	public static void main(String[] args) {
		WebElement bc= new WebElement();
		bc.click();
		bc.setText("Superclass");

	}

}
