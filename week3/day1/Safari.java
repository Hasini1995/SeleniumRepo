package week3.day1;

public class Safari extends Browser{
	public void readerMode() {
		System.out.println("readerMode");
	}
	public void fullScreenMode() {
		System.out.println("fullScreenMode");
	}

	public static void main(String[] args) {
		Safari ss=new Safari();
		ss.closeBrowser();
		ss.navigateBack();
		ss.openURL();
		ss.readerMode();
		ss.fullScreenMode();
		

	}

}
