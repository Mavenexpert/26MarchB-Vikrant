package WaitingMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitMethods {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
            
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(2000));
		WebElement aboutUS = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(aboutUS));
		aboutUS.click();
	}

}
