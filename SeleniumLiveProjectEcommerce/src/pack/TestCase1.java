
//*                                                                                          *
//*    Guru99 eCommerce Live Project                                                         *
//*    Day 1 - TestCase 1                                                                    *
//*    Author: Krishna Rungta                                                                *                                                                                      *

//********************************************************************************************
/*  

Test Steps
Step 1. Goto http://live.demoguru99.com/
Step 2. Verify Title of the page
Step 3. Click on ‘MOBILE’ menu
Step 4. Verify Title of the page
Step 5. In the list of all mobile , select ‘SORT BY’ dropdown as ‘name’
Step 6. Verify all products are sorted by name
*/

package pack;

//import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.AssertJUnit;

import org.testng.annotations.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;

public class TestCase1 {
	private WebDriver driver;
	private String baseUrl;
	public int scc = 1;

	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeMethod
	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("browser open");
		// Step 1 Goto http://live.demoguru99.com/
		baseUrl = "http://live.demoguru99.com/";
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testDay1TestCase1() throws Exception {

		driver.get(baseUrl);
		// Step 2. Verify Title of the page
		String demoSite = driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(demoSite);
		try {
			AssertJUnit.assertEquals("THIS IS DEMO SITE FOR   ", demoSite);
			Assert.assertEquals("THIS IS DEMO SITE FOR   ", demoSite);
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		// Step 3. Click on ‘MOBILE’ menu
		driver.findElement(By.linkText("MOBILE")).click();
		// Step 5. In the list of all mobile , select ‘SORT BY’ dropdown as ‘name’
		new Select(driver.findElement(By.cssSelector("select[title=\"Sort By\"]"))).selectByVisibleText("Name");

		// Step 6. Verify all products are sorted by name
		// this will take a screen shot of the manager's page after a successful login
		scc = (scc + 1);
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 ////String png = ("C:\\Users\\Priyanka Dash\\Desktop\\Eclipse Projects\\SeleniumLiveProjectEcommerce" + scc + ".png");
		//// FileUtils.copyFile(scrFile, new File(png));
		// FileHandler.copy(scrFile, new File("C:\eclipse\Reports\"));
		//**************************************************************************************************************************	
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();

	}

	/*
	 * public void takeScreenShot() throws IOException { TakesScreenshot scrShot =
	 * ((TakesScreenshot) driver);
	 * 
	 * // Call getScreenshotAs method to create image file
	 * 
	 * File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	 * 
	 * // Move image file to new destination
	 * 
	 * File DestFile = new File("C:\\eclipse\\test.bmp"); //
	 * FileUtils.copyFile(SrcFile, DestFile); FileHandler.copy(SrcFile, new
	 * File("C:/eclipse/Reports/screenshot.png")); }
	 */
}
