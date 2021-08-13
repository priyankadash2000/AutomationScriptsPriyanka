package Pac1;

import org.testng.annotations.Test;

public class TestNgGroups {
	  @Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
		  System.out.println("Inside testMethod1");
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
		  System.out.println("Inside testMethod2");
	  }
	 
	  @Test(groups = { "functest" })
	  public void testMethod3() {
		  System.out.println("Inside testMethod3");
	  }
	  
	  @Test(groups= {"checkintest"})
	  public void testMethod4()
	  {
		  System.out.println("Inside testMethod4");
		  
	  }
	  
	}
