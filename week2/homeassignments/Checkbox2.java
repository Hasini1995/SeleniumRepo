package week2.homeassignments;
	

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Checkbox2 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/checkbox.xhtml");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='j_idt87:j_idt91_input']/ancestor::div[@id='j_idt87:j_idt91']")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//div[@id='j_idt87:id_container']/ancestor::div[@id='j_idt87:msg_container']"));
	//System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:id_container']/ancestor::div[@id='j_idt87:msg_container']")).isDisplayed());
	driver.findElement(By.xpath("//*[@id=\"j_idt87:msg_container\"]/div/div/div[2]/span"));
	driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']/ancestor::td")).click();
	driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='ui-growl-item-container ui-state-highlight ui-corner-all ui-helper-hidden ui-shadow ui-growl-info']/parent::div[@id='j_idt87:id_container']"));
	//driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']/ancestor::div[@class='card']")).click();
	driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']/parent::div")).click();
	driver.findElement(By.xpath("//div[@class='ui-growl-item-container ui-state-highlight ui-corner-all ui-helper-hidden ui-shadow ui-growl-info']/parent::div"));
	System.out.println(driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]")).isEnabled());






	}

			
		}


}
