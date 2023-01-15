package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScenario {
	
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();

		System.out.println("User is on Guru99 home");
	}

	@When("The user enter valid username & Password")
	public void the_user_enter_valid_username_password() {
	   
		driver.findElement(By.id("email")).sendKeys("user123@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("user123");
		
	}

	@When("Clicks on the login button")
	public void clicks_on_the_login_button() {
	    
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@When("The user should be navigated to home page")
	public void the_user_should_be_navigated_to_home_page() {
	    
		String currentURL= driver.getCurrentUrl();
		if(currentURL==("https://demo.guru99.com/test/success.html")) {
			System.out.println("Login page sucess");
		} 
	}

	@Then("The webpage should be closed")
	public void the_webpage_should_be_closed() {
	    
		driver.quit();
	}
}
