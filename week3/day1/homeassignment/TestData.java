package week3.day1.homeassignment;

public class TestData {
	public void enterCredentials() {
		System.out.println("This is coming from Superclass: enterCredentials.");
	}
	public void navigateToHomePage() {
		System.out.println("This is coming from superclass: navigateToHomePage.");
	}

	public static void main(String[] args) {
		TestData superclass= new TestData();
		superclass.enterCredentials();
		superclass.navigateToHomePage();
	}

}
