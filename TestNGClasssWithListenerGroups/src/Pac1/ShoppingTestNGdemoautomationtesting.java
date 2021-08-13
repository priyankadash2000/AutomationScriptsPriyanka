package Pac1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShoppingTestNGdemoautomationtesting {
	private String baseurl="http://practice.automationtesting.in/";
	private String driverPath="C:\\eclipse\\BrowserDrivers\\chromedriver.exe";
	private WebDriver driver;
	
  @BeforeTest
  public void launchBrowser() {
	     System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		driver.get(baseurl);	  
		System.out.println(" launching browser...");
  }
    @AfterTest
  public void afterTest() {
	  driver.close();
	  System.out.println("browser closed..");
  }
  
	@Test(priority=1)
	  public void doShopping() throws AWTException {
		  System.out.println("doing shopping test");
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ESCAPE);
		  driver.findElement(By.linkText("Shop")).click();;
		  WebElement img = driver.findElement(By.cssSelector("img[alt='Selenium Ruby']"));
		  img.click();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"product-160\"]/div[2]/form/button")).click();;
		  String cartmessage=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]")).getText();
		  System.out.println(cartmessage);
		 // Assert.assertEquals("\\“Selenium Ruby\\” has been added to your basket.", cartmessage);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a")).click();;
		  
		//  steps to finish till end
		 
	  }
	@Test(priority=0)
	  public void goToMyAccount() throws AWTException {
		  System.out.println("Inside My Account");
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ESCAPE);
		  driver.findElement(By.linkText("My Account")).click();;
		  
		 
	  }

}
