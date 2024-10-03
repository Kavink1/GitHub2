package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demoapps.qspiders.com/");
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
}
