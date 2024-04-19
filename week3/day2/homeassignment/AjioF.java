package week3.day2.homeassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioF {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//div[@class='length']/strong"));
		System.out.println("Total Items Found:" + findElement.getText());
		List<WebElement> brandElements = driver.findElements(By.cssSelector(".brand"));
        System.out.println("List of brands:");
        for (WebElement brandElement : brandElements) {
            System.out.println(brandElement.getText());
        }

        // Get the list of names of the bags and print it
        List<WebElement> bagNameElements = driver.findElements(By.cssSelector(".name"));
        System.out.println("List of bag names:");
        for (WebElement bagNameElement : bagNameElements) {
            System.out.println(bagNameElement.getText());
        }

		
		

	}

}
