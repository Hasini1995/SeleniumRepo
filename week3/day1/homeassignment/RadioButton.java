package week3.day1.homeassignment;

public class RadioButton  extends Button{
	public void selectRadioButton() {
		System.out.println("This is a RadioButton subclass: selectRadioButton().");
	}

	public static void main(String[] args) {
		RadioButton sc3= new RadioButton();
		sc3.click();
		sc3.setText("Test");
		sc3.submit();
		sc3.selectRadioButton();
		
	}

}
