package SeleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSel {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://vctcpune.com/selenium/practice.html");
	
		//driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).click();
		
		driver.findElement(By.xpath("//input[@type='radio'][3]")).click();
		
		//driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("123");
		
		
		
		//input[@type='radio'][3]																													
	}

}
