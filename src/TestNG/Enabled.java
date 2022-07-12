package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  @Test
  public void tC1() 
  {
  
  Reporter.log(" tc1 is running ", true);
  
  }
  @Test (enabled=false)
  public void tC2() 
  {
  
  Reporter.log(" tc2 is running ", true);
  
  }
  @Test
  public void tC3() 
  {
  
  Reporter.log(" tc3 is running ", true);
  
  }


}
