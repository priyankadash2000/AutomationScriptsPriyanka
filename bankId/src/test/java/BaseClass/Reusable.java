package BaseClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Constants;


public class Reusable {
	public WebDriver driver;
	public Reusable(WebDriver driver)
	{
		this.driver = driver;
	}
	public  void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\BrowserDrivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	public  void navigateURL()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Constants.url);
	}
	public  void closeBrowser()
	{
		driver.close();
	}
}
