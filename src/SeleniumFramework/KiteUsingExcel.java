package SeleniumFramework;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	
	{
		File myfile= new File("C:\\Vikrant\\New folder (2)\\26MarchB.xlsx");
				org.apache.poi.ss.usermodel.Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
				String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
				String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
				String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
				System.setProperty("webdriver.chrome.driver", "C:\\Vikrant\\\\New folder (2)\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
				Thread.sleep(2000);
				WebElement userID = driver.findElement(By.id("userid"));
				WebElement passWord = driver.findElement(By.id("password"));
				WebElement loginButton =
				driver.findElement(By.xpath("//button[@type='submit']"));
				userID.sendKeys(UN);
				passWord.sendKeys(PWD);
				loginButton.click();
				Thread.sleep(1000);
				WebElement pin = driver.findElement(By.id("pin"));
				WebElement continueButton =
				driver.findElement(By.xpath("//button[@type='submit']"));
				pin.sendKeys(PIN);
				continueButton.click();
				Thread.sleep(2000);
				WebElement userName =
				driver.findElement(By.xpath("//span[@class='user-id']"));
				String actualUserID = userName.getText();
				String expectedUserID=UN;
				if(actualUserID.equals(expectedUserID))
				{
				System.out.println("User ID matching TC is PASSED");
				}
				else {
				System.out.println("User ID not matching TC is FAILED");
				}
				userName.click();
				Thread.sleep(100);
				driver.findElement(By.xpath("//a[@target='_self']")).click();
				Thread.sleep(3000);
				driver.close();

	}

}