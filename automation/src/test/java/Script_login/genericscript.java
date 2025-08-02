package Script_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class genericscript
{
	protected WebDriver driver;
	@BeforeMethod
	public void launchapp()
	{
		System.setProperty("webdriver.chrome.driver","./Path/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://dev-dash.janitri.in/");
	}
	@AfterMethod
	public void closeapp()
	{
		
		//driver.quit();
	
	}
		
}