package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//WebElement textbox = driver.findElement(By.id("autocomplete"));
	//	textbox.sendKeys("Vikrant");
		
		//Create object of actions class
		
		Actions act= new Actions(driver);
		
		//act.sendKeys(textbox, "Vkrant").perform();
		
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Thread.sleep(1500);
		
		act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
	
		Thread.sleep(1500);
	
	}

}
