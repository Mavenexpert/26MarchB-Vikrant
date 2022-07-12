package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyprtutorials {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("alertBox")).click();
     	 Alert alt = driver.switchTo().alert(); 
     	Thread.sleep(2000);
		 System.out.println(alt.getText());
		 alt.accept();
		 
		 driver.findElement(By.id("confirmBox")).click();
     	 Alert alt2 = driver.switchTo().alert(); 
     	Thread.sleep(2000);
		 System.out.println(alt2.getText());
		 alt2.accept();
		 
		 driver.findElement(By.id("promptBox")).click();
		 Thread.sleep(2000);
     	 Alert alt3 = driver.switchTo().alert(); 
		 System.out.println(alt3.getText());
		 alt3.sendKeys("Hi");
		 alt3.dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());

	}

}
