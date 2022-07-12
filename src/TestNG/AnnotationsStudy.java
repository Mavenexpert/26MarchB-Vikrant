package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy {
  @Test
  public void validateUserID() 
  {
  
      Reporter.log("User ID Validated", true);
  
  }
 
  @Test
  public void validateDashbord() 
  {
	  
	  Reporter.log("Dashboard Validated", true);
  
  }
  
  @BeforeMethod
  public void logintoKiteApp() 
  {
	  
	  Reporter.log("Login Successful", true);
  
  }
  
  @BeforeClass
  public void launchBrowser() 
  {
	  
	  Reporter.log("Browser Launched", true);
  
  }
  @AfterMethod
  public void logoutfromKiteApp() 
  {
	  
	  Reporter.log("Logout Successful", true);
  
  }
  
  @AfterClass
  public void closeBrowser() 
  {
	  
	  Reporter.log("Browser Closed", true);
  
  }
  
}


