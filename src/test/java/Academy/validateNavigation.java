package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resourcesnew.base;

public class validateNavigation extends base {
	
@BeforeTest
	
	public void initializeBrowser() throws IOException 
	{
		 driver= initializeDriver();	
		   driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void NavigationbarValidation() throws IOException
	{
			LandingPage l = new LandingPage(driver);
			Assert.assertTrue(l.getNavigationBar().isDisplayed());
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
