package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableWithoutStepDefi {
	
	WebDriver driver;
	
	@Given("You are on the login page")
	public void you_are_on_the_login_page() {
	    
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();

		System.out.println("User is on Guru99 home");
	}

	@When("You enter the below data")
	public void you_enter_the_below_data(io.cucumber.datatable.DataTable dataTable) {
	    
		List<String> data = dataTable.asList(String.class);
		String userName = data.get(0);
		String password = data.get(1);
		
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@When("You should be seen to home page")
	public void you_should_be_seen_to_home_page() {
	   
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("You must be closed")
	public void you_must_be_closed() {
	    
		driver.quit();
		System.out.println("Chrome driver is closed");
		
	}
}
