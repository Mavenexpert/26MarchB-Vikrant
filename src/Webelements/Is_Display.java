package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Display {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
	
	/*	Thread.sleep(1000);   
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		 WebElement show  = driver.findElement(By.id("show-textbox"));
		 WebElement textbox = driver.findElement(By.name("show-hide"));
		System.out.println(textbox.isDisplayed());
		if (textbox.isDisplayed())
		{
		 	   System.out.println("Thank you text box is displayed");
		}
		else
		{
			  System.out.println("cant find textbox");
		}
		
		hide.click();
		System.out.println(textbox.isDisplayed());

		if (textbox.isDisplayed())
		{
		 	   System.out.println("Thank you text box is displayed");
		}
		else
		{
			  System.out.println("cant find textbox");
		}
	
	
	}
}*/
		Thread.sleep(15000);
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		 WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		
		if(textbox.isDisplayed())
				{
			
		            System.out.println(" Textbox displayed");
				
				}
		else
		{
		
			System.out.println(" cant show textbox");
		}
		Thread.sleep(2000);
		hide.click();
		
		if(textbox.isDisplayed())
		{
	
            System.out.println(" Textbox displayed");
		
		}
else
{

	System.out.println(" cant show textbox");
}
		
	}

}