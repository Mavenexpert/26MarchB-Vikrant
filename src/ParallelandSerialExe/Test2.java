package ParallelandSerialExe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void myMethod2() {
  
	  System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
  
  
  }
}
