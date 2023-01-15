package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableWithStepDefi {

	WebDriver driver;

	@Given("Login the page")
	public void login_the_page() {

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();

		System.out.println("User is on Guru99 home");
	}

	@When("Enter the below data")
	public void enter_the_below_data(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> dataKeyValue = dataTable.asMaps(String.class, String.class);
		String userName = dataKeyValue.get(0).get("UserName");
		String password = dataKeyValue.get(0).get("Password");
	
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@When("Click login button")
	public void click_login_button() {

		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("Webpage should be closed")
	public void webpage_should_be_closed() {

		driver.quit();
		System.out.println("Driver closed");
	}

}
