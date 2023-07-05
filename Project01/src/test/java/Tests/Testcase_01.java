package Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import File_pkg.Driver;
import File_pkg.Loginpage;

public class Testcase_01 {

	@BeforeClass
	public static void driver_instation() throws IOException
	{
		Driver.getDriver();
	}
	
	@Test
	public static void loginWithValidcredentials() throws InterruptedException
	{
		Loginpage.loginPageActions();
		
	}
	
	@AfterClass
	public static void driver_exit()
	{
		Driver.quitdriver();
	}
}
