package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataStepDefi {
	
	WebDriver driver;
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();

		System.out.println("User is on Guru99 home");
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String userName, String password) {
	    
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@When("Clicks the login button")
	public void clicks_the_login_button() {
	    
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@When("The user should be seen to home page")
	public void the_user_should_be_seen_to_home_page() {
	    
		String currentURL= driver.getCurrentUrl();
		if(currentURL==("https://demo.guru99.com/test/success.html")) {
			System.out.println("Login page sucess");
		} 
	}

	@Then("The webpage must be closed")
	public void the_webpage_must_be_closed() {
	    
		driver.quit();
	}
}
