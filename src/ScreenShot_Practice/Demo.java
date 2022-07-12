package ScreenShot_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File ("C:\\Vikrant\\ScreenShot\\ss2.png");
		
		FileHandler.copy(source, Destination);
		

	}

}
