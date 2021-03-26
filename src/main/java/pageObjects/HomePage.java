package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By title = By.xpath("//h1[contains(@class,'margin-base-vertical')]");
	public void verifyHomepage() {
		driver.findElement(title).isDisplayed();
	}
}
