package Iframe_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		Thread.sleep(2000);
		
		String text1 = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		
		System.out.println("Text is  "+ text1);
		
		driver.switchTo().frame("Frame1");
		
		String text2 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		
		System.out.println("Test is   "+ text2);
		
		
		driver.switchTo().parentFrame();
		
		String text3 = driver.findElement(By.linkText("Pavilion")).getText();
		
		System.out.println("Main page text is  "  + text3 );


		
	}

}
