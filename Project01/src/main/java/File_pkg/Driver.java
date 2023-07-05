package File_pkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

	public static WebDriver  driver;
	public static 	Properties prop= new Properties();

	public static void base123() throws IOException
	{
		FileInputStream fis= new FileInputStream("C:\\GIT_workspace\\ABC-repository\\Project01\\cong.properties");
		prop.load(fis);
		fis.close();


	}

	public static void getDriver() throws IOException
	{ 
		//base123();
		FileInputStream fis= new FileInputStream("C:\\GIT_workspace\\ABC-repository\\Project01\\cong.properties");
		prop.load(fis);
		fis.close();

		driver=new EdgeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	public static void quitdriver()
	{
		driver.quit();
	}
}





