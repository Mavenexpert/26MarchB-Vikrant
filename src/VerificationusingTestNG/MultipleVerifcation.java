package VerificationusingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerifcation {
  @Test
  public void myMethod() {
 
  String a = "Pune1";
  String b= "Pune";
  
 Assert.assertNotEquals(a, "value of a and b are equals , TC is failed ");
  Assert.assertNotNull(b, "TC is failed, value is null");
  
  }
}
