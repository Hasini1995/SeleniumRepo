package week3.day1;

public class SubclassChrome extends Browser {
	public void openIncognito()
	{
		System.out.println("openIncognito");
		
	}
	public void clearCache() {
		System.out.println("clearCache");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubclassChrome chrome= new SubclassChrome();
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		chrome.openIncognito();
		chrome.clearCache();
		
		

	}

}
