package browser;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import mainobje.facebookobject;
import mainobje.gmailobj;

public class facebook extends invocation {

	
	public static Logger log=LogManager.getLogger(facebook.class.getName());
	public WebDriver driver;
	public ExtentTest test;
	
	

	/*@BeforeMethod()
	public void browser() throws IOException
	{
		driver=openbrowser();
	} */
	
	@Test
	public void test() throws IOException
	{
		driver=openbrowser();
	   	facebookobject ob=new facebookobject(driver);
		driver.manage().window().maximize();
        driver.get(pro.getProperty("url"));
        log.error("this is error message");
		ob.email(pro.getProperty("name"));
		//test.info("entered namee");
		log.info("this is infooo");
		ob.password();
		log.fatal("this is fatal");
		//test.info("Password");
		
		ob.submit1().click();
		
			}
	
	
	@AfterMethod()
	public void close() throws InterruptedException
	{
		
		driver.quit();
	}
	
	@Test
	public void mail() throws IOException
	{

		driver=openbrowser();
		gmailobj gm=new gmailobj(driver);
		driver.manage().window().maximize();
		driver.get(pro.getProperty("gmailurl"));
		log.debug("this is debug");
		gm.fname().sendKeys(pro.getProperty("fname"));
		log.warn("this is warn");
		log.trace("this is trace");
		gm.lname().sendKeys(pro.getProperty("lname"));
		gm.Username().sendKeys(pro.getProperty("username"));
		gm.Passwd().sendKeys(pro.getProperty("pass"));
		gm.ConfirmPasswd().sendKeys(pro.getProperty("cpass"));
		gm.next().click();
		
	}
}
