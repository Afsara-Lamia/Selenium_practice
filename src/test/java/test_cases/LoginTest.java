package test_cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys(Sendkeys.getProperty("Username_Sendkey"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Password"))).sendKeys(Sendkeys.getProperty("Password_Sendkey"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Submit"))).click();
	}

}
