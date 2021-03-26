package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyperlink {
	WebDriver driver;
	String linkName = "privacy";
	/*
	 * U can update link name to open the link url. Follow this rules:
	 * 	1. terms			= Term and Condition
	 *  2. privacy			= Privacy
	 *  3. qxf2				= Copyright 
	 */
	
	public Hyperlink(WebDriver driver) {
		this.driver = driver;
	}
	
	By a_termCondition = By.xpath("//a[text()='Terms and Conditions']");
	By a_privacy = By.xpath("//a[text()='Privacy']");
	By a_copyright = By.xpath("//a[text()='Qxf2 Services']");
	
	public void clickLink() {
		if(linkName == "terms") {
			driver.findElement(a_termCondition).click();;
		}else if(linkName == "privacy") {
			driver.findElement(a_privacy).click();
		}else if(linkName == "qxf2") {
			driver.findElement(a_copyright).click();
		}else {
			System.out.println("link not found");
		}
	}
	
	public void verifyLink() {
	if(driver.getCurrentUrl().contains(linkName)) {
		System.out.println("Success");
	}else {
		System.out.println("Fail");
	}
	}
}
