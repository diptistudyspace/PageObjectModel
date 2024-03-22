package pix.Pixabay.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortfolioPage {
	public static void clickProfile(WebDriver driver) {
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		driver.quit();
	}

}
