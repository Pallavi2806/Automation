package Script_login;


import org.testng.annotations.Test;

public class testclass {
	
	public class test extends genericscript
	{
		
		
		@Test
		public void Test1()
		{
			Login l=new Login(driver);
		
			l.click();
			l.click1();
			l.click2();

}
}
}