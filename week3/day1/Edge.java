package week3.day1;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("takeSnap");
		
	}
	public void clearCookies() {
		System.out.println("clearcookies");
	}
	public static void main(String[] arge) {
		Edge ee = new Edge();
		ee.navigateBack();
		ee.openURL();
		ee.closeBrowser();
		ee.takeSnap();
		ee.clearCookies();
	}
}
