package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Vikrant\\New folder (2)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		

	}

}
