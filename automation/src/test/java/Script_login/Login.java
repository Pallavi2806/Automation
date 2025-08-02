package Script_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//input[@name='email']")
	private WebElement userid ;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='login-button']")
	private WebElement login;

public Login(WebDriver driver)
	
	{
	
		PageFactory.initElements(driver,this);
	}
	public void click() {
		userid.click();
	}
	public void click1() {
		password.click();
	}
	public void click2() {
		login.click();
	}
}