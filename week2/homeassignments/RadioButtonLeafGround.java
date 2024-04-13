package week2.homeassignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonLeafGround {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Firefox']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
	     System.out.println(driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled());
    
        
         System.out.println(driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected());
        
	}

}
