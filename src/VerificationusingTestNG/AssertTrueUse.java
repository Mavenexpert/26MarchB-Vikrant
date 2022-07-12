package VerificationusingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void trueUse() {
  
  boolean a = true;
  boolean b= false;
  
  Assert.assertFalse(a, " TC failed if value is false");
  Reporter.log(" TC is passed",true);
  }
}
