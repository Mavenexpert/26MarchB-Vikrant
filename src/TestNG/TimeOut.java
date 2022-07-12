package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
  @Test
  public void ab1() 
  {
    Reporter.log(" ab1 is running", true);
  
  
  }

  @Test (timeOut=5000)
  public void ab2() throws InterruptedException 
  {
    Reporter.log(" ab2 is running", true);
  Thread.sleep(3000);
  
  }

}
