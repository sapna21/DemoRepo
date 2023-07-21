package test;

import org.testng.annotations.Test;

public class Testing2 {
  @Test (groups = "smoke")
  public void test3() {
	  System.out.println("test3");
  }
  
  @Test (groups = "sanity")
  public void test4() {
	  System.out.println("test4");
  }
}
