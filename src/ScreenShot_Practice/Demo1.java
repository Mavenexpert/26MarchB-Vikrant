package ScreenShot_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String str= RandomString.make(3);
		
		 File destination= new File ("C:\\Vikrant\\ScreenShot\\ fp "+str+".png");
		 
		 FileHandler.copy(Source, destination);
		 
		

		 
	}

}
