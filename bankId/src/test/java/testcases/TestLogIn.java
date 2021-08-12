package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Reusable;
import pageobjectsRepository.AddPayee;
import pageobjectsRepository.Login;
import pageobjectsRepository.homepage;
import utilities.Constants;

@Listeners(TestListener.class)

public class TestLogIn {
	WebDriver driver;
	//Reusable res;
	@BeforeTest
	public void beforelogin()
	{
		/*
		 * res=new Reusable(driver); res.OpenBrowser(); res.navigateURL();
		 */			
		  System.setProperty("webdriver.chrome.driver","C:\\eclipse\\BrowserDrivers\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://zero.webappsecurity.com/");
				
	}
	
	@Test(priority=0)
	public void signin()
	{	
		homepage homepage=new homepage(driver);
		homepage.signin().click();
		
	}
	@Test(priority=1)
	public void logIn() 
	{	Login login=new Login(driver);
		login.UserName().sendKeys(Constants.username);
		login.password.sendKeys(Constants.password);
		login.submitbtn().click();		
	}
	@Test(priority=2)
	public void addPayee()
	{	
		AddPayee adp=new AddPayee(driver);
		driver.navigate().to("http://zero.webappsecurity.com/bank/account-summary.html");
		adp.payBillsTab().click();
		adp.addnewPayee().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		adp.payeeName().sendKeys("HydroOne Utility");
		adp.payeAddress().sendKeys("200 RoberSpec Pkwy, Mississauga, ON  L6R1K9");
		adp.payeeAccount().sendKeys("123234434");
		adp.payeeDetails().sendKeys("Natural Gas Utility");
		adp.submitPayee().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//adp.gotoPayBills();	
		if(adp.alertContent().getText().equalsIgnoreCase("The new payee HydroOne Utility was successfully created."))
		   {
			   System.out.println("payee added");
		   }
	}
	
	@AfterTest	
		public void close()
		{
		driver.close();
		}
}
