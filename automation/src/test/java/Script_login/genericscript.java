package Script_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class genericscript
{
	WebDriver driver;
	@BeforeMethod
	public void launchapp()
	{
		System.setProperty("webdriver.chrome.driver","./Path/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	}
	@AfterMethod
	public void closeapp()
	{
		
		//driver.quit();
	
	}
		
}