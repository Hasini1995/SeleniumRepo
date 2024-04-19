package week3.day1.homeassignment;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		System.out.println("This is a clickCheckButton subclass : clickCheckButton.");
	}
	public static void main(String[] args) {
		CheckBoxButton sc2 =new CheckBoxButton();
		sc2.click();
		sc2.setText("sample");
		sc2.submit();
		sc2.clickCheckButton();

	}

}
