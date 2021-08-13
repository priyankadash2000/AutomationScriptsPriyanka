package Pac1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FisrstTestNG {
	//String baseurl="http://demo.guru99.com/test/newtours";
	String driverPath="C:\\eclipse\\BrowserDrivers\\chromedriver.exe";
	public WebDriver driver;
	@Test
  
   public void verifyHomePageTitle() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours");
		String expectedTitle="Welcome: Mercury Tours";
		//System.out.println(driver.getTitle());
		//String title=driver.getTitle();
		//System.out.println("your page title is  "+title);
		
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
		
	  
  }
}
