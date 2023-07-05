package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import File_pkg.Driver;
import File_pkg.Loginpage;

public class Testcase_01 {

	@BeforeClass
	public static void driver_instation()
	{
		Driver.getDriver();
	}
	
	@Test
	public static void loginWithValidcredentials() throws InterruptedException
	{
		Loginpage.loginPageActions();
		
	}
}
