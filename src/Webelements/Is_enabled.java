package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enabled {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(5000);
		
		WebElement OTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		System.out.println(OTP.isEnabled());
		
		driver.findElement(By.name("mobileNumber")).sendKeys("8329402256");
		Thread.sleep(3000);
		
		System.out.println(OTP.isEnabled());
		
		
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	
		System.out.println(getOTPButton.isEnabled());
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9881527081");
		Thread.sleep(1000);
		System.out.println(getOTPButton.isEnabled());
		getOTPButton.click(); */
	}

}
