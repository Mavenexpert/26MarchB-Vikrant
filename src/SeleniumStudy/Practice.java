package SeleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) 
	
	{
	   System.setProperty("webdriver.chromedriver.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
	   
	   WebDriver driver= new ChromeDriver ();
	   driver.get("https://www.amazon.in/");
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
	   
	   

	}

}