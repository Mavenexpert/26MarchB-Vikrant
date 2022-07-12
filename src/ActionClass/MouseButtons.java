package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseButtons {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		
		WebElement seleniumbutton = driver.findElement(By.linkText("Selenium"));
		
	//	seleniumbutton.click();
		
		//to click using the Actions class
		// create an object of action class and pass driver as an arguement
		 Actions act= new Actions(driver);
		//act.moveToElement(seleniumbutton).perform();
		//act.contextClick(seleniumbutton).perform();
		 //act.click(seleniumbutton).perform();
		 //act.moveToElement(seleniumbutton).click().build().perform();

	//WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
	 //act.moveToElement(rightclickbutton).contextClick().build().perform();
	// act.contextClick(rightclickbutton).perform();
		 
	WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	//act.moveToElement(doubleclick).doubleClick().build().perform();
	act.doubleClick(doubleclick).perform();
	
	Thread.sleep(1000);
	Alert alt = driver.switchTo().alert();
	alt.accept();

	}

}
