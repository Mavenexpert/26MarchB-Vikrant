package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethod 

{
  @Test (priority=1)
  public void login() {
  
  Reporter.log("Login Successful", true);
  }

  @Test (priority=2)
  public void verifyPin() {
  
  Reporter.log("Pin Verified", true);
  }

  @Test (dependsOnMethods="login")
  public void logout() {
  
  Reporter.log("logout successful", true);
  }
}
