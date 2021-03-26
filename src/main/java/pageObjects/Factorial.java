package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Factorial {
	WebDriver driver;
	int inputValue=10;
	int factorialResult = 3628800;
	
	public Factorial(WebDriver driver) {
		this.driver = driver;
	}
	
	By input_integer = By.xpath("//input[@id='number']");
	By button_calculate = By.xpath("//button[@id='getFactorial']");
	
	public void inputInteger() {
		String val = String.valueOf(inputValue);
		driver.findElement(input_integer).sendKeys(val);
	}
	
	public void calculate() {
		driver.findElement(button_calculate).click();
	}
	
	By displayeResult = By.xpath("//p[@id='resultDiv']");
	
	public void verifyResult() {
		driver.findElement(displayeResult).isDisplayed();
	}
}
