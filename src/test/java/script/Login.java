package script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;

public class Login extends BaseTest
{
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.name("name")).sendKeys("hi");
		driver.findElement(By.name("email")).sendKeys("hi");
		Thread.sleep(2000);
	}
}
