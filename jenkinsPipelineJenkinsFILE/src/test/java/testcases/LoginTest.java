package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@Test
	public void TC001() throws InterruptedException {
		
		WebDriver driver  = null;
		String browser = "chrome";
		if (browser.contains("chrome")){
			driver = WebDriverManager.chromedriver().create();	
		}
		else if(browser.contains("firefox")) {
			
		driver = WebDriverManager.firefoxdriver().create();
		}
		else if(browser.contains("edge")) {
			driver = WebDriverManager.edgedriver().create();
		}
		
		
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		Thread.sleep(4);
		driver.quit();
		
		
	}
	

}
