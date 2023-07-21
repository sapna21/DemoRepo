package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
  @Test(priority = 1, groups = { "smoke","important","sanity"})
  public void createUser() {
	  System.out.println("I am in Home Test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(4>3, "Verifying Element");//we use regular assert in industry
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc", "abc");
  }
  
  @Test(priority = 2,dependsOnMethods = "createUser",groups = { "smoke","important","sanity"} )
  public void editUser() {
	  System.out.println("Before Assertion1");
	  softAssert.assertTrue(2>3, "Verifying Element");//
	  System.out.println("After Assertion1");
	 softAssert.assertAll();//similar to error collector in junit
  }
  
  @Test(priority = 3,dependsOnMethods = "editUser",groups = { "smoke","important","sanity"})
  public void deleteUser() {
	  System.out.println("I am in end Test");
	  System.out.println("Before Assertion2");
	  softAssert.assertTrue(2>3, "Verifying Element");//
	  System.out.println("After Assertion2");
	  softAssert.assertEquals("abc", "abc1");
	  System.out.println("After 2nd Assertion");
	 softAssert.assertAll();//similar to error collector in junit
  }
  
}
