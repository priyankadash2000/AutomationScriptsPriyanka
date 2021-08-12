package testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class TestListener implements ITestListener {		
	private static ThreadLocal parentTest = new ThreadLocal();
    private static ThreadLocal test = new ThreadLocal();
	ExtentReports extent=ExtentManager.createInstance("extentnew.html");;
		
		
	
		public synchronized void onStart(ITestContext context) {
	    	ExtentTest parent = extent.createTest(getClass().getName());
			/*
			 * test=extent.createTest(((ITestContext) extent).getName()); // create new
			 * entry in the report test.log(Status.PASS, "Test Case passed IS " +
			 * context.getName()); test.log(Status.PASS, "TEST CASE passed IS " +
			 * ((ITestResult) context).getThrowable());
			 */
	        parentTest.set(parent);
		}

	
		public synchronized void onFinish(ITestContext context) {
			extent.flush();
		}
		

		public synchronized void onTestStart(ITestResult result) {
			ExtentTest child = ((ExtentTest) parentTest.get()).createNode(result.getMethod().getMethodName());
	        test.set(child);
		}


		public synchronized void onTestSuccess(ITestResult result) {
			((ExtentTest) test.get()).pass("Test passed");
		}

	
		public synchronized void onTestFailure(ITestResult result) {
			((ExtentTest) test.get()).fail(result.getThrowable());
		}

		public synchronized void onTestSkipped(ITestResult result) {
			((ExtentTest) test.get()).skip(result.getThrowable());
		}

		
		public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}
	}

