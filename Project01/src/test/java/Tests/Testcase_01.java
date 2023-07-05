package Tests;

import org.testng.annotations.Test;

import File_pkg.Loginpage;

public class Testcase_01 {

	@Test
	public static void loginWithValidcredentials() throws InterruptedException
	{
		Loginpage.loginPageActions();
		
	}
}
