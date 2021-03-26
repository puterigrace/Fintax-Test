package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Factorial;
import pageObjects.HomePage;
import pageObjects.Hyperlink;

public class FintaxGlue {
	WebDriver driver;
	
	@Given("User navigate to the site url")
	public void user_navigate_to_the_site_url() {
		System.setProperty("webdriver.chrome.driver","D://PRA-KERJA//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://qainterview.pythonanywhere.com/");
	}

	@Given("User is on site")
	public void user_is_on_site() {
	    HomePage hmp = new HomePage(driver);
	    hmp.verifyHomepage();
	}

	@When("User input the number")
	public void user_input_the_number() {
	    Factorial fc = new Factorial(driver);
	    fc.inputInteger();
	}

	@When("Click calculate button")
	public void click_calculate_button() {
		Factorial fc = new Factorial(driver);
		fc.calculate();
	}

	@Then("System display factorial result notification")
	public void system_display_factorial_result_notification() {
	    Factorial fc = new Factorial(driver);
	    fc.verifyResult();
	}
	
	@When("User click hyperlink displayed")
	public void user_click_hyperlink_displayed() {
	    Hyperlink hp = new Hyperlink(driver);
	    hp.clickLink();
	}

	@Then("User navigate to the url")
	public void user_navigate_to_the_url() {
		Hyperlink hp = new Hyperlink(driver);
		hp.verifyLink();
	}
}
