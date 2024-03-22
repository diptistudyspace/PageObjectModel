package pix.Pixabay.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {	//Page Object Model base class
	private static WebDriver driver;   
	
	@BeforeTest
	public void Setup() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=0)
	public void testLoginPage() {
		LoginPage.clickLoginButton(driver);
	}
	
	@Test(priority=1)
	public void testPortfolioPage() {
		PortfolioPage.clickProfile(driver);	
	}
}
