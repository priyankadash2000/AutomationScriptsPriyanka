package Pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

@Test // test suite
public class ThirdtestNG {
	String baseurl = "http://demo.guru99.com/test/newtours";
	String driverPath = "C:\\eclipse\\BrowserDrivers\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours");
		System.out.println(" launching browser...");
	}

	@BeforeMethod
	public void verifyHomePageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		System.out.println("The actual title is  " + actualTitle);
		// Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Test(priority = 1)
	public void verifySignon() {

		driver.findElement(By.linkText("SIGN-ON")).click();
		;
		System.out.println("verify sgin on");
		String expT = "Sign-on: Mercury Tours";
		String actT = driver.getTitle();
		Assert.assertEquals(expT, actT);
	}

	@Test(priority = 0)
	public void verifyRegister() {
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println("verify register");
		String expT = "Register: Mercury Tours";
		String actT = driver.getTitle();
		Assert.assertEquals(expT, actT);
	}

	@AfterMethod
	public void gobackHomePage() {
		// driver.navigate().back()
		System.out.println("go back home ...");
		driver.findElement(By.linkText("Home")).click();
		;
	}

	@AfterTest
	public void afterTest() {
		System.out.println("closing driver...");
		driver.close();
	}

}
