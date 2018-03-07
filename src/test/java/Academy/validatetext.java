package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resourcesnew.base;

public class validatetext extends base {
	
	@BeforeTest
	public void initializeBrowser() throws IOException 
	{
		 driver= initializeDriver();	
		   driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
		@Test
		public void textValidation() throws IOException, InterruptedException
		
		{
			LandingPage l = new LandingPage(driver);
			//below code will grab the text in the button
			//l.getCheckitoutButton().getText();
			//in order to validate we use Assertions 
			Assert.assertEquals(l.getCheckitoutButton().getText(), "CHECK IT OUT");
			
		}
		
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}
}