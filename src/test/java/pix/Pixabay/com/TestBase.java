package pix.Pixabay.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase { // Page Object Model base class
	WebDriver driver;
	@Test
	public void testLoginPage() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.userName().sendKeys("Admin");
		loginpage.password().sendKeys("admin123");
		loginpage.loginButton().click();
		
		PortfolioPage pfpage=new PortfolioPage(driver);
		pfpage.setting().click();
		
		Assert.assertTrue(pfpage.DashBoard().isDisplayed(),"Dashboard element is displayed.");
		
		pfpage.logout().click();
		
		
	}
	@AfterTest
	public void closure() {
		driver.quit();
	}
}



/*ExplicitWait
  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds

        LoginPage loginpage = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginpage.userNameLocator())).sendKeys("Admin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginpage.passwordLocator())).sendKeys("admin123");
        wait.until(ExpectedConditions.elementToBeClickable(loginpage.loginButtonLocator())).click();

        PortfolioPage pfpage = new PortfolioPage(driver);
        wait.until(ExpectedConditions.elementToBeClickable(pfpage.settingLocator())).click();
        wait.until(ExpectedConditions.elementToBeClickable(pfpage.logoutLocator())).click();*/
