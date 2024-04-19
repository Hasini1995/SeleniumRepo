package week3.day2.homeassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortingCollection {

	public static void main(String[] args) {
		
		        // Declare a String array
		        String[] stringArray = {"HCL", "Wipro", "Aspire Systems", "CTS"};

		        // Create a WebDriver instance (assuming Chrome WebDriver)
		        WebDriver driver = new ChromeDriver();

		        // Open a blank page
		        driver.get("about:blank");

		        // Reverse loop to iterate the collection
		        for (int i = stringArray.length - 1; i >= 0; i--) {
		            // Print each element
		            System.out.print(stringArray[i] + ", ");
		            // Print each element on the web page
		            driver.findElement(By.tagName("body")).sendKeys(stringArray[i] + ", ");
		        }

		        // Close the WebDriver instance
		        driver.quit();
		    }


	}

