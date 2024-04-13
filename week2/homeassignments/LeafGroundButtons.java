package week2.homeassignments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LeafGroundButtons {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='card']//span)")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.getTitle();
		System.out.println("Title of the page:"+ title);
		Thread.sleep(5000);
		//String text = driver.findElement(By.xpath("").getText();;
		//if (text.contains(title))
		//{
			//System.out.println("Both tile are same");
		//}
		//else
		//{
			//System.out.println("Title are different");
		//}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().back();
		System.out.println("Disabled:"+driver.findElement(By.xpath("(//div[@class='card']//button)[2]")).isDisplayed());
		System.out.println("position:"+driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
       System.out.println("BackgroundColor:"+driver.findElement(By.xpath("//div[@class='card']//span[text()='Save']")).getCssValue("background-color"));
       System.out.println("Height & width:"+driver.findElement(By.xpath("(//div[@class='card']//span[text()='Submit'])[2]")).getSize());
       driver.close();     
        
	}

}
