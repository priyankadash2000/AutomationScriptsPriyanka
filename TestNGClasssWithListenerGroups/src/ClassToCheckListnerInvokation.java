import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerDemo.class)
public class ClassToCheckListnerInvokation {
  @Test
  public void f1() {
	  Assert.assertTrue(true);
  }
  
  @Test
  public void f2() {
	  Assert.assertTrue(false);
  }
  @Test
  public void f3() {
	  throw new SkipException("Skipping this test method");
  }
}
