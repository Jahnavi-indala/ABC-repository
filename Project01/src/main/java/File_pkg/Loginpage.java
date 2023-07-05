package File_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Loginpage extends Driver {


	private static final By txtusername=By.xpath("//input[@name='username']");
	private static final By txtpassword=By.xpath("//input[@name='password']");
	private static final By clickLoginBtn=By.xpath("//button[@type='submit']");
	
	
	
	
	
	private static  WebElement loginUserName()
	{
		return driver.findElement(txtusername);
		
	}

	private static  WebElement loginPassword()
	{
		return driver.findElement(txtpassword);
		
	}
	private static  WebElement loginbutton()
	{
		return driver.findElement(clickLoginBtn);
		
	}
	
	
	
	
	public static void txtUserName()
	{
	    loginUserName().sendKeys("Admin");
	}
	
	public static void txtPassword()
	{
		loginPassword().sendKeys("admin123");
	}
	public static void clickLoginBtn()
	{
		loginbutton().click();
	}
	
	
	
	public static void loginPage() throws InterruptedException
	{
		txtUserName();
		Thread.sleep(3000);
		txtPassword();
		Thread.sleep(3000);
		clickLoginBtn();
	}
}
