package pageobjectsRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login {

	WebDriver driver;
	@CacheLookup
	@FindBy(name = "user_login")
	public WebElement username;
	@CacheLookup
	@FindBy(name = "user_password")
	public WebElement password;
	@CacheLookup
	@FindBy(name = "submit")
	public WebElement submitbtn;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement UserName() {
		return username;
	}

	public WebElement password() {
		return password;
	}
	
	public WebElement submitbtn() {
		return submitbtn;
	}
	
}
