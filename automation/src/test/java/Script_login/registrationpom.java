package Script_login;



	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationpom {
	
	@FindBy(id="name")
	private WebElement fullname;
	@FindBy(id="email")
	private WebElement eml;
	@FindBy(id="password")
	private WebElement psw;
	@FindBy(id="mobile")
	private WebElement mob;
	@FindBy(xpath ="//div[@data-val='fresher']")
	private WebElement sel;
	@FindBy(id="currentCity")
	private WebElement city;
	
	@FindBy(xpath="(//i[@class='ico resman-icon resman-icon-check-box'])[2]")
	private WebElement checkbox;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	
	

	public registrationpom(WebDriver driver)
	
	{
	
		PageFactory.initElements(driver,this);
	}
	public void Entername() {
		fullname.sendKeys("Pallavi");
	}
	public void Entereml() {
		eml.sendKeys("sp@gmail.com");
	}
	public void Enterpassword()
	{
		psw.sendKeys("sp@123");
	}
	
	public void Entermoblie() {
		mob.sendKeys("8951557766");
	}
	
	public void Entercity() {
		city.sendKeys("Bengaluru");
		}
	public void clicksel()
	{
	
		sel.click();
	}
	
	public void Clickcheckbox()
	{
	checkbox.click();
	}
	public void Clickbutton() {
		btn.click();
	}

}
