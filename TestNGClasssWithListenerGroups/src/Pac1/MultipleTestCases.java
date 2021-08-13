package Pac1;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MultipleTestCases {
  @Test
  //(priority=3)
  public void c_test() {
	  //Assert.fail();
	 //throw new SkipException(" Custom Exception.....");
	  System.out.println("testing from testin-failed.xml");
  }
  @Test
  //(priority=1)
  public void a_test() {
	  Assert.assertTrue(true,"true");
	  System.out.println("true");
  }
  @Test
  //(priority=2)
  public void b_test() {
	  Assert.assertFalse(false);
	  System.out.println("false");
  }
}
