package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		
driver.findElement(By.name("email")).sendKeys("testleaf.2023@gmail.com");
driver.findElement(By.name("pass")).sendKeys("Tuna@321");
driver.findElement(By.name("login")).click();
driver.findElement(By.linkText("Find your account and log in.")).click();

	}

}
