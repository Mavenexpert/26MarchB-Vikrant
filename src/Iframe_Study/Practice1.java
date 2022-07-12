package Iframe_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
	Thread.sleep(2000);
	
	      String text1 = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
	
               System.out.println(" Text is   "+ text1);
             
               // switching selenium focus from main page to frame 1
                driver.switchTo().frame("frame1");
                driver.findElement(By.tagName("input")).sendKeys("Hi Vikrant");
                driver.switchTo().frame("frame3");
           
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@id='a']")).click();
           
           driver.switchTo().defaultContent();
           
           driver.switchTo().frame("frame2");
          WebElement text2 = driver.findElement(By.id("animals"));
          Select s = new Select(text2);
          
         System.out.println(s.isMultiple());
          s.selectByVisibleText("Avatar");
          
        Thread.sleep(2000);
        s.selectByValue("big baby cat");
          
          
         
	}

}
