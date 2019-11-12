package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	WebDriver driver;
	@Given("user launches chromeBrowser And navigate to application")
	public void user_launches_chromeBrowser_And_navigate_to_application() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.navigate().to("http://newtours.demoaut.com/");
	    
	}

	@When("user enter username as {string} in username field")
	public void user_enter_username_as_in_username_field(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
	    
	}

	@When("user enter password as {string} in password1 field")
	public void user_enter_password_as_in_username_field(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	   
	}

	@When("click Signin")
	public void click_Signin() {
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("validates Login success")
	public void validates_Login_success() {
		Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
	    
	}
}
