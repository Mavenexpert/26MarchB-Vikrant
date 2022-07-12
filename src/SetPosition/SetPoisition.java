package SetPosition;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPoisition {

	public static void main(String[] args) throws InterruptedException 
	
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getPosition());
		// to set position we need to create object of Point Class and pass X and Y coordinate
		Point p= new Point(200, 10);
		// using SetPosition method we can set the browser position
		driver.manage().window().setPosition(null);

	}

}
