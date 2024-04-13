package week2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	String accname="Hasini";
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(accname);
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
	WebElement dropdown = driver.findElement(By.name("industryEnumId"));
	Select dd=new Select(dropdown);
	dd.selectByVisibleText("Computer Software"); 
	WebElement findElement = driver.findElement(By.name("ownershipEnumId"));
	Select dd1=new Select(findElement);
	dd1.selectByVisibleText("S-Corporation");
	WebElement findElement2 = driver.findElement(By.id("dataSourceId"));
	Select dd2=new Select(findElement2);
	dd2.selectByValue("LEAD_EMPLOYEE");
	WebElement findElement3 = driver.findElement(By.id("marketingCampaignId"));
	Select dd3=new Select(findElement3);
	dd3.selectByIndex(6);
	WebElement findElement4 = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select dd4=new Select(findElement4);
	dd4.selectByValue("TX");
	
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	String text = driver.findElement(By.xpath("(//span[@class='requiredField']/following::span)[1]")).getText();
	if (text.contains(accname))
	{
		System.out.println("Both account are same");
	}
	else
	{
		System.out.println("Account are different");
	}
	//driver.close();
	
	

	}

}
