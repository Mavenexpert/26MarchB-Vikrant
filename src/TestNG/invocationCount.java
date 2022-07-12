package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount 

{
  @Test(invocationCount=5)
  public void myTest() 
  {
  Reporter.log("My Test Running", true);
  
  }
}
