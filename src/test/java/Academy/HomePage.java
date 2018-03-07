package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Login;
import resourcesnew.base;

public class HomePage extends base
{
	
	@BeforeTest
	
	public void initializeBrowser() throws IOException 
	{
		 driver= initializeDriver();	
		   
	}
	
	@Test(dataProvider = "getData")
	public void HomePageNavigation(String EmailId,String Password) throws IOException, InterruptedException
	
	{
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LandingPage l = new LandingPage(driver);
		Actions a = new Actions(driver);
		a.moveToElement(l.getRewardsXpath()).click().build().perform();
		Thread.sleep(3000);
		l.clickSignIn().click();
		Login lg = new Login(driver);
		lg.EmailId().sendKeys(EmailId);
		lg.Password().sendKeys(Password);
		lg.Signin().click();
	}
	
	@DataProvider
	public Object[][] getData() 
	{
		//create an array to hold id and password
		Object[][] data = new Object[2][2];
		data[0][0] ="saranya@gmail.com";
		data[0][1]="12345";
		
		data[1][0] ="pavan@gmail.com";
		data[1][1]="12345789";
		
		return data;					
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver = null;
	}
	
}
