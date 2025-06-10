package Script_login;


import org.testng.annotations.Test;

public class test extends genericscript
{
	
	
	@Test
	public void Test1()
	{
		registrationpom rp=new registrationpom(driver);
	
		rp.Entername();
		rp.Entereml();
		rp.Enterpassword();
		rp.Entermoblie();
		rp.clicksel();
		rp.Entercity();
		rp.Clickcheckbox();
		rp.Clickbutton();
		
	
	
	
	}

}