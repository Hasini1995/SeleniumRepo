package week2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hasini");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password@123");
		WebElement dropdown = driver.findElement(By.id("day"));
		Select dd=new Select(dropdown);
		dd.selectByValue("12");
		WebElement dropdown1 = driver.findElement(By.id("month"));
		Select dd1=new Select(dropdown1);
		dd1.selectByIndex(5);
		WebElement dropdown2 = driver.findElement(By.id("year"));
		Select dd2=new Select(dropdown2);
		dd2.selectByVisibleText("1988");
		driver.findElement(By.xpath("//input[@name='sex']")).click();

	}

}
