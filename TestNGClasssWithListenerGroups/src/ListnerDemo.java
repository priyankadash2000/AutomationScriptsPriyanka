import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerDemo implements ITestListener{
	
	
	
	
	  public void onTestStart(ITestContext context) {
	  System.out.println(context.toString()+"  On start method started"); } 
	  
	  public void onFinish(ITestResult result) {
	  System.out.println("On FInish method started"); } 
	  public void  onTestSuccess(ITestResult result)
	  
	  { System.out.println("on test success method"+result.getName()); }
	  
	  public  void onTestFailure(ITestResult result)
	  
	  { System.out.println("on test Failure method"+result.getName()); }
	  
	  public void onTestSkipped(ITestResult result)
	  
	  { System.out.println("on test skipped method"+result.getName()); }
	 
}
