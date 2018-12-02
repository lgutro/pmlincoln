package pmcincoln;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Test;

public class TestBase {
	
	public WebDriver driver = null;
	public Properties prop = null;

	public void OpenBrowserToSite() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//pmcincoln//datadriven.properties");
		
		prop.load(fis);
	    System.setProperty(prop.getProperty("drivertype"),prop.getProperty("driverloc"));

	    System.out.println("The browser under test is "+ prop.getProperty("browser"));
	    
		if (prop.getProperty("browser").equals("firefox"))
		{	
		driver = new FirefoxDriver();
		}
		else if (prop.getProperty("browser").equals("chrome"))
		{
		driver = new ChromeDriver();
		}
		else
		{
		driver = new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));

	}
	}
	
