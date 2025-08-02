package Script_login;

import org.testng.annotations.Test;

import Script_login.Login;
import Script_login.genericscript;

public class testclass1 {
	
	public class test extends genericscript
	{
		
		
		@Test
		public void test1()
		{
			login1 l=new login1(driver);
		
			l.enteruserid();
			l.enterpassword();
			l.clickoneyeicon();
			l.click();

}
}
}