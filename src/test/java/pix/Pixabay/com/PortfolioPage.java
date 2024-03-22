package pix.Pixabay.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortfolioPage {

	WebDriver driver;
	
	public PortfolioPage(WebDriver driver) {
		
		this.driver=driver;
	}
	private By setting = By.className("oxd-userdropdown-tab");
	private By DashBoard=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");
	private By logout = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");

	public WebElement setting() {
		return driver.findElement(setting);
	}
	public WebElement DashBoard() {
		return driver.findElement(DashBoard);
	}

	public WebElement logout() {
		return driver.findElement(logout);
	}
	

}
