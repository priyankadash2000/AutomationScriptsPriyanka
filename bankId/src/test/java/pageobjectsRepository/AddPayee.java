package pageobjectsRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddPayee {
	WebDriver driver;
	@CacheLookup
	@FindBy(linkText ="Pay Bills")
	WebElement Pay_Bills_Tab;
	public WebElement payBillsTab()
	{
		return Pay_Bills_Tab;
		
	}
	
	@CacheLookup
	@FindBy(linkText ="Add New Payee")
	WebElement Add_New_Payee;
	public WebElement addnewPayee()
	{
		return 	Add_New_Payee;
	
	}
	
	@CacheLookup
	@FindBy(xpath ="//*[@id=\"np_new_payee_name\"]")
	WebElement payeename;
	public WebElement payeeName()
	{
	return payeename;
	}
	
	@CacheLookup
	@FindBy(xpath ="//*[@id=\"np_new_payee_address\"]")
	WebElement payeaddress;
	public WebElement payeAddress()
	{
		return payeaddress;
	}
	@CacheLookup
	@FindBy(id="np_new_payee_account")
	WebElement payeeaccount;
	public WebElement payeeAccount()
	{
		return payeeaccount;
	}
	
	
	@CacheLookup
	@FindBy(id="np_new_payee_details")
	WebElement payeedetails;
	public WebElement payeeDetails()
	{
		return payeedetails;
	}
	
	@CacheLookup
	@FindBy(id="add_new_payee")
	WebElement submitpayee;
	public WebElement submitPayee()
	{
		return submitpayee;
	}
	
	@CacheLookup
	@FindBy(id="alert_content")
	WebElement we;
	public WebElement alertContent()
	{
		return we;
	}
		
		
	public AddPayee(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
}
