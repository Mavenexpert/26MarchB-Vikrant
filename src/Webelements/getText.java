package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText());

	}
}
