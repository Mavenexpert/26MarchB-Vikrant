package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExclude {
  @Test
  public void ab1() {
  
  Reporter.log("ab1 is passed", true);
  
  }

  @Test
  public void ab2() {
  
  Reporter.log("ab2 is passed", true);
  
  }

  @Test
  public void ab3() {
  
  Reporter.log("ab3 is passed", true);
  
  }


}
