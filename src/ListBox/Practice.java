package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
	WebElement cld = driver.findElement(By.name("dropdown-class-example"));
	

	
	Select sd=new Select (cld);
	
	System.out.println("Mutliselectable  "+ sd.isMultiple());
	
	sd.selectByVisibleText("Option3");
	
	Thread.sleep(2000);
	
	sd.selectByValue("option2");
	
	Thread.sleep(2000);
	
	sd.selectByIndex(1);
	
	Thread.sleep(2000);
	sd.getFirstSelectedOption();
	
	
	
	
		

	}
	

}
