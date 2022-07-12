package VerificationusingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod() {
  
  String a="Nashik";
  String b="Nashik1";
  
 // Assert.assertEquals(a, b, " a and b values are not matching TC failed");
//  Reporter.log(" a and b values are matching TC is passed");
  
  Assert.assertNotEquals(a, b, " a and b values are matching TC is passed");
  Reporter.log(" a and b values are not matching TC is passed",true);
  //Assert.fail();
  }
}
