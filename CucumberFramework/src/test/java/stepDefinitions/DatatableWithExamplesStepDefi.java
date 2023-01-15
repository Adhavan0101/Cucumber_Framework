package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DatatableWithExamplesStepDefi {

	WebDriver driver;
	
	@Given("Login the webpage")
	public void login_the_webpage() {
	    
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();

		System.out.println("User is on Guru99 home");
	}

	@When("Enter the data {string} and {string}")
	public void enter_the_data_and(String userName, String password) {
	   	
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@When("Clickd login button")
	public void clickd_login_button() {
	   
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("Page should be closed")
	public void page_should_be_closed() {
	    
		driver.quit();
		System.out.println("Driver closed");
	}

}
