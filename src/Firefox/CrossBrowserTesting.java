
package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
 
	  @Test
	  public void crossBrowser(String name) throws InterruptedException 
	  {
	 WebDriver driver = null;
	  if(name.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Vikrant\\New folder (2)\\geckodriver.exe");
			driver=new FirefoxDriver();
	  }
	  else if (name.equals("chrome")) 
	  
	  {
			System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
	  driver= new ChromeDriver();
	  }
	  
	  driver.manage().window().maximize();
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 Thread.sleep(2000);
	 driver.close();
	  }
	 

  }

