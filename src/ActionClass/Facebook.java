package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Actions act= new Actions(driver);
		act.click(day).perform();
		for(int i=1;i<=7;i++)
		{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		//WebElement firstname = driver.findElement(By.name("firstname"));
		//firstname.sendKeys("Yogendra");
		//act.keyDown(firstname, Keys.SHIFT).sendKeys("y").keyUp(Keys.SHIFT).sendKeys("ogendra").build().perform();

	}

}