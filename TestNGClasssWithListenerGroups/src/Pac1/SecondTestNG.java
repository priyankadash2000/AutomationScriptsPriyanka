package Pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SecondTestNG {
	String baseurl="http://demo.guru99.com/test/newtours";
	String driverPath="C:\\eclipse\\BrowserDrivers\\chromedriver.exe";
	public WebDriver driver;
	 
  @BeforeTest
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours");
		System.out.println(" launching browser...");
	  
  }
  
  @Test
  public void verifyHomePageTitle() {
	  
	  String expectedTitle="Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
