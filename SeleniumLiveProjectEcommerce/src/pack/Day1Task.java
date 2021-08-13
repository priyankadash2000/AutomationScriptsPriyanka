package pack;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Day1Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\BrowserDrivers\\chromedriver.exe");
		
		try {
		
			WebDriver driver=new ChromeDriver();
				
			System.out.println("chrome browser invoked");
			driver.get("http://live.demoguru99.com/index.php/");
			String title=driver.getTitle();
			System.out.println(title);
			
			String demoSite  = driver.findElement(By.cssSelector("h2")).getText();
			System.out.println(demoSite);
			
			
			WebElement e=driver.findElement(By.linkText("MOBILE"));
			System.out.println(e.getText());
			if(title.equals("Home page"))
			{
			driver.findElement(By.linkText("MOBILE")).click();
			String title2=driver.getTitle();
			System.out.println(title2);

			WebElement e1=driver.findElement(By.xpath("//select[@title='Sort By']"));
			System.out.println(e1.getTagName());
			Select s1=new Select(e1);
			s1.selectByValue("http://live.demoguru99.com/index.php/mobile.html?dir=asc&order=name");
			//-----------------------------------------------------
			//driver.findElement(By.xpath("//span[contains(text(),'Add to Cart']"));
			//*[@id="top"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button/span/span
			System.out.println(driver.findElement(By.cssSelector("h2.product-name")).getText());
			
			//--------------------------------------------------------
			//How to acees all the values of a page and check it according to test data(expected result)
			String item3=driver.findElement(By.cssSelector("a[title='Sony Xperia']")).getText();
			String item1=driver.findElement(By.cssSelector("a[title='IPhone']")).getText();
			String item2=driver.findElement(By.cssSelector("a[title='Samsung Galaxy']")).getText();
			String items[]= {item1,item2,item3};
			String itembackup[]=items;
			
			
		      int size = items.length;

		      for(int i = 0; i<size-1; i++) 
		      {
		         for (int j = i+1; j<items.length; j++)
		         
		         {
		            if(items[i].compareTo(items[j])>0)
		            {
		               String temp = items[i];
		               items[i] = items[j];
		               items[j] = temp;
		            }
		         }
		      }
		      if(items.equals(itembackup))
		      {
		    	  System.out.println("sorted");
		      }
			
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		//driver.get("http://live.demoguru99.com/index.php/");
		
		

	}

}
