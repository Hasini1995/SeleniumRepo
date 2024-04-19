package week3.day1.homeassignment;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("This is coming from sub class : enterUsername.");
	}
	public void enterPassword() {
		System.out.println("This is coming from sub class: enterPassword.");
	}

	public static void main(String[] args) {
		LoginTestData subclass= new LoginTestData();
		subclass.enterCredentials();
		subclass.navigateToHomePage();
		subclass.enterUsername();
		subclass.enterPassword();
		
	}

}
