package VerificationusingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssetNullUse {
  @Test
  public void nullUse() {
  
  String a=null;
  String b="abc";
  
 // Assert.assertNull(a, " value is not null TC is failed");
  //Reporter.log(" value is null TC is passed");
  
  Assert.assertNotNull(b, "value is null TC is passed");
  Reporter.log("value is not null TC is passed");
  
  }
}
