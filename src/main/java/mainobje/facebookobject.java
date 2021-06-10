package mainobje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookobject {

	
	
	WebDriver driver;
	public facebookobject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement submit;
	
	
	public WebElement email(String str1)
	{
		 email.sendKeys(str1);
		return email;
	}
	
	public WebElement password()
	{
		password().click();
		return password();
	}
	
	public WebElement submit1()
	{
		return submit;
	}
	
}
