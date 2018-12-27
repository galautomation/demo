import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jana {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://clickdimensions.com/solutions-our-technology/");
		//Click to remove the message
		driver.findElement(By.cssSelector("#trackMe")).click();
		Thread.sleep(2000);
		//move to the button first ("scroll" to the button)
		WebElement element = driver.findElement(By.cssSelector(".fusion-button-text"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		Thread.sleep(2000);
		//clikc on the button
		driver.findElement(By.cssSelector(".fusion-button-text")).click();
		
	}

}
