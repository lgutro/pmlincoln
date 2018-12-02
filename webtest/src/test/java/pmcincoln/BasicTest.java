package pmcincoln;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BasicTest extends TestBase {
	
	@Test(enabled=true)
	public void VerifyHomePageUrl() throws IOException
	{		
		System.out.println("Test for url");
		OpenBrowserToSite();
		String act = driver.getCurrentUrl();
		String gld = prop.getProperty("url");
		System.out.println("The url is " +act); 
		Assert.assertTrue(gld.equals(act));
	}
	
	@Test(enabled=true)
	public void VerifyHomePageTitle() throws IOException
	{		
		System.out.println("Test for title");
		OpenBrowserToSite();
		String act = driver.getTitle();
		String gld = prop.getProperty("title");
		System.out.println("The title is " +act); 
		Assert.assertTrue(gld.equals(act));		
	 }
	

	@AfterMethod
	public void CloseDriver() 
	{
	System.out.println("Closing driver"); 		
	driver.close();
	}
	
}


