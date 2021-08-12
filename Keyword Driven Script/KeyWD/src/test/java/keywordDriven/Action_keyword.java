package keywordDriven;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Constants;



public class Action_keyword {

	public static WebDriver driver=null;
	public static void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\BrowserDrivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void navigateURL()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Constants.URL);
	}
	public static void enterUser()
	{
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys(Constants.username);
	}
	public static void enterPasword()

	{
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(Constants.password);
	}
	public static void clickOnLogin()
	{
		driver.findElement(By.xpath("//input[@id='user_submit']")).click();
	}
	public static void closeBrowser()
	{
		driver.close();
	}

}
