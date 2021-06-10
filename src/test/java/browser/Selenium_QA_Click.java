package browser;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_QA_Click {

	@Test
	public void test1()
	 {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#top");
		driver.manage().window().maximize();
	int it=driver.findElements(By.cssSelector("input.radioButton")).size();
	System.out.println(it);
	for(int i=0;i<it;i++)
	{
		String str=driver.findElements(By.cssSelector("input.radioButton")).get(i).getAttribute("value");
		if(str.equals("radio3"))
		{
			driver.findElements(By.cssSelector("input.radioButton")).get(i).click();
		}
	}

		
	}
	
	}
	


