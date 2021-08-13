package toolsqa.pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CreateUserAccount {
	private String baseurl="http://demo.automationtesting.in/Register.html";
	private String driverPath="C:\\eclipse\\BrowserDrivers\\chromedriver.exe";
	private WebDriver driver;		
  @Test(priority=1)
  /*
   * Step 1: go to url
   * Step2: click on new user button and print the title and url
   * step3: Input values in the form fields
   */
  public void createUserAccount()
  {  	  
	  System.out.println("doing createUserAccount test");
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("priya");	
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("das");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("7 cc");
	  driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("p@das21");
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("9155567891");
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input")).click();
	  driver.findElement(By.id("checkbox1")).click();  	  
     Select countries=new Select(driver.findElement(By.id("countries")));
     countries.selectByIndex(1);
     Select yearbox=new Select(driver.findElement(By.id("yearbox")));
     yearbox.selectByValue("1989");
    Select month=new Select (driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
    month.selectByValue("July");
    Select day=new Select (driver.findElement(By.id("daybox")));
    day.selectByValue("10");
    driver.findElement(By.id("firstpassword")).sendKeys("pass1@P");
    driver.findElement(By.id("secondpassword")).sendKeys("pass1@P");  
   driver.findElement(By.id("submitbtn")).click();  		 
  }
  
  
  @BeforeMethod
  public void beforeMethod() { 
	  System.out.println("Inside before method .."+driver.getTitle()+"   "+driver.getCurrentUrl());  
  }

  @AfterMethod
  public void afterMethod() {
	  
	driver.findElement(By.linkText("Register")).click();;  
	     
  }

  
  @BeforeTest
  public void launchBrowser() {
	     System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		driver.get(baseurl);	  
		System.out.println(" launching browser..."+baseurl);   }

  @AfterTest
  public void afterTest() {
	 driver.close();
	  System.out.println("browser closed..");
  }

}
