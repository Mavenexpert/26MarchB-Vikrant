package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mytestclass {
  @Test
  public void myMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
  }
}
