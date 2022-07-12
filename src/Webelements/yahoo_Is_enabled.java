package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo_Is_enabled {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/search?q=yahoo+mail&rlz=1C1GCEB_enIN973IN973&sxsrf=ALiCzsYEAI6lFvz-4RHXjuV8DWDyg2XRAQ%3A1653412820543&ei=1BONYoLgIKGar7wP3f-j0Ac&ved=0ahUKEwiCmtfe0vj3AhUhzYsBHd3_CHoQ4dUDCA4&uact=5&oq=yahoo+mail&gs_lcp=Cgdnd3Mtd2l6EAMyCggAELEDEIMBEEMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgUIABCABDIFCAAQgAQyCAgAELEDEIMBMgUIABCABDIFCAAQgAQ6CAgAEIAEELEDSgQIQRgASgQIRhgAUPsDWKsJYN8LaAFwAHgAgAGAAYgBtQSSAQMwLjWYAQCgAQHAAQE&sclient=gws-wiz");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[text()='Yahoo Mail']")).click();
		
		Thread.sleep(2000);
		
		
		 
		 driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		 
			Thread.sleep(2000);
			
			 WebElement next = driver.findElement(By.id("login-signin"));
		 System.out.println(next.isEnabled());
		 
		 driver.findElement(By.id("login-username")).sendKeys("Vikrant");
			Thread.sleep(2000);
		 // is selected method
		 WebElement id = driver.findElement(By.id("persistent"));
		  System.out.println(id.isSelected());
			Thread.sleep(2000);
		  
		 
		 
		 

	}

}
