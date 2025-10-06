package examplesScripts;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Test;

public class plainSelenium {
	
	@Test
	public void launch_demosite() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://5elementslearning.dev/demosite");
		driver.findElement(By.linkText("My Account")).click();
		if(driver.getPageSource().contains("Welcome, Please Sign In")) {
			driver.quit();
		}else {
			driver.quit();
		}
	}
}
