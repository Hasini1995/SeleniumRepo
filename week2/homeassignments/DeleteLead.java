package week2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); 
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click(); 
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210"); 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//WebElement leadElement = driver.findElement(By.xpath("//span[text()='Lead List']"));
		//String leadID=leadElement.getText();
		//System.out.println("Lead ID of the first resulting lead:" +leadID);
		//leadElement.click();
		//driver.findElement(By.xpath("//a[text()='10048']")).getText();
		driver.findElement(By.xpath("//a[text()='10048']")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//String leadID="10012";
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10048");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement findElement2 = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String msg=findElement2.getText();
		if (msg.equals("No records to display"))
		{
			System.out.println("Lead deleted successfully");
		}
		else
		{
			System.out.println("Lead not deleted");
		}
		driver.close();
		

	}

}
