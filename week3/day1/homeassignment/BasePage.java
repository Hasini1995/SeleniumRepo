package week3.day1.homeassignment;

public class BasePage {
	public void findElement() {
		System.out.println("This is a super class: findElement");
	}
	public void clickElement() {
		System.out.println("This is a super class: clickElement");
	}
	public void enterText() {
		System.out.println("This is a super class: enterText");
	}
	public void performCommonTasks() {
		System.out.println("This is a super class : performCommonTasks");
	}

	public static void main(String[] args) {
		BasePage or= new BasePage();
		or.findElement();
		or.clickElement();
		or.enterText();
		or.performCommonTasks();
		

	}

}
