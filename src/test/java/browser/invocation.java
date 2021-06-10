package browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class invocation  {

	public Properties pro;
	public FileInputStream str;
	public WebDriver driver;
	public WebDriver openbrowser() throws IOException
	{
		pro=new Properties();
		str=new FileInputStream(".\\Utilities2\\data.properties");
		pro.load(str);
		String brow=pro.getProperty("browser");
		
		if(brow.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		} 
		
		else if(brow.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(brow.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",".\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		return driver;
	}
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	} 
}
