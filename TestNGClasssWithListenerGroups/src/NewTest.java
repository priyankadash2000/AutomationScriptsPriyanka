import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerDemo.class)
public class NewTest {	
	WebDriver driver;	
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
@Test
public void openBrowser() {
	
	driver.get("http://demo.guru99.com/test/newtours");
	 String expectedTitle="Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		System.out.println("laucning url...");
		
}
@Test
public void closeBrowser()
{
	driver.close();
	Reporter.log("driver got closed after testing"); //??????????????????
	//???????????????????????????????????????????????????????
}
	private int i=1;
	@Test
	public void accoutTest()
	{
		if(i==2)
		{
			Assert.assertEquals(i, i);
			i++;
		}
	}
	@Test
	public void skipTest()
	{
		throw new SkipException("Skipping this test method");
	}
}
