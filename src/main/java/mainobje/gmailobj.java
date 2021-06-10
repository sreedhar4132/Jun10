package mainobje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailobj {

	WebDriver driver;
	public gmailobj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="firstName")
	WebElement fname;
	

	@FindBy(name="lastName")
	WebElement lname;
	

	@FindBy(name="Username")
	WebElement Uname;
	
     @FindBy(name="Passwd")
     WebElement password;
     
     @FindBy(name="ConfirmPasswd")
     WebElement ConfirmPasswd;
     
     @FindBy(id="accountDetailsNext")
     WebElement next;
     
     
     
     public WebElement fname()
     {
		return fname;
     }
     
     public WebElement lname()
     {
		return lname;
     }
     
     public WebElement Username()
     {
		return Uname;
     }
     
     public WebElement Passwd()
     {
		return password;
     }
     
     public WebElement ConfirmPasswd()
     {
		return ConfirmPasswd;
     }
     
     public WebElement next()
     {
		return next;
     }
     
     
	

}
