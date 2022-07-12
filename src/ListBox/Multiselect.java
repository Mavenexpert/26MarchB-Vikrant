package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException
	
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);   

		 WebElement cars = driver.findElement(By.name("cars"));
		 Select c = new Select(cars);
		 
		 System.out.println("Multiselectable "+ c.isMultiple());
		 
		 c.selectByVisibleText("Volvo");
		 Thread.sleep(5000);   
		 c.selectByValue("saab");
		 Thread.sleep(5000);   
		 c.selectByIndex(2);
		 Thread.sleep(5000);   
		 c.selectByIndex(3); 
		 Thread.sleep(4000); 
		 
		//c.deselectAll();
	     c.deselectByIndex(3);
	     Thread.sleep(2000); 
		  c.deselectByIndex(2);
		  Thread.sleep(2000); 
		  c.deselectByValue("saab");
		  
		  System.out.println(c.getFirstSelectedOption().getText());
		 c.getAllSelectedOptions();

	}

}
