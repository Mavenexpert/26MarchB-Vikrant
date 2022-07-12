package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeyword {
  @Test (priority=1)
  public void d() {
 
  Reporter.log(" d is running", true);
  
  
  }

  @Test (priority=3)
  public void c() {
 
  Reporter.log(" c is running", true);
  
  
  }
  @Test (priority=2)
  public void a() {
 
  Reporter.log(" a is running", true);
  
  
  }


}


