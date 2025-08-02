package Script_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 {
	@FindBy(xpath="//input[@name='email']")
	private WebElement userid ;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='login-button']")
	private WebElement login;
	
	@FindBy(xpath="//img[@class='passowrd-visible']")
	private WebElement eyeicon;

public login1(WebDriver driver)
	
	{
	
		PageFactory.initElements(driver,this);
	}
	public void enteruserid() {
		userid.sendKeys("Abc@gmail.com");
	}
	public void enterpassword() {
		password.sendKeys("psw@123");
		
	}
	public void clickoneyeicon() {
		eyeicon.click();
		
	}
	public void click() {
		login.click();
	}
}

	

