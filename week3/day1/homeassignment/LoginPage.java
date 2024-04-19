package week3.day1.homeassignment;

public class LoginPage extends BasePage{
	public void performCommonTasks() {
		System.out.println("This is a subclass performCommonTasks: override." );
	}

	public static void main(String[] args) {
		LoginPage or1=new LoginPage();
		or1.findElement();
		or1.clickElement();
		or1.enterText();
		or1.performCommonTasks();

	}

}
