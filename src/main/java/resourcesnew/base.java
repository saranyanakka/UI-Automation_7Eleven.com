package resourcesnew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	   
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException 
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Saranya\\FullFrameworkProject\\src\\main\\java\\resourcesnew\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Saranya\\Documents\\selenium - java\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		
		else if(browserName.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
		else 
		{
			System.out.println("browser not found");
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
		
	}
	/*public void getScreenshot(String result)

	{

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File(""C://test//"+result+"failtest1"")); */
		

}
