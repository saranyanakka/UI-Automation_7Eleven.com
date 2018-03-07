package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	
	public WebDriver dr;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.dr = driver;
	}
	
	//Actions rewards = new Actions(dr);
	By rewards = By.xpath("//*[@id='menu-item-1001']/a");
	By signinJoin = By.xpath("//*[@id='menu-item-5493']/a[text()='Sign-In / Join Now']");
	
	By Checkitoutbutton = By.xpath("//a[text()='Check it Out']");
	By navigationbar = By.xpath("//*[@id='main_nav']");
	
	public WebElement getRewardsXpath()
	{		
		
		 return dr.findElement(rewards);
	}
	
	public WebElement clickSignIn()
	{
		return dr.findElement(signinJoin);
	}
	
	public WebElement getCheckitoutButton()
	{		
		
		 return dr.findElement(Checkitoutbutton);
	}
	
	public WebElement getNavigationBar()
	{		
		
		 return dr.findElement(navigationbar);
	}
	
}
