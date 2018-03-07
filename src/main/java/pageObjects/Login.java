package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver dr;
	public Login(WebDriver driver) 
	{
		this.dr=driver;
	}
	

	By username = By.xpath("//*[@id='rewards_sign_in_email']");
	
	By password = By.xpath("//input[@id='rewards_sign_in_password']");
	
	By signin = By.xpath("//button[text()='Sign In']");  
	

	
	public WebElement EmailId() {
		return dr.findElement(username);
	}
	
	public WebElement Password()
	{
		return dr.findElement(password);
	}
	
	public WebElement Signin()
	{
		return dr.findElement(signin);
	}
	
}
