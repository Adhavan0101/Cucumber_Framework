package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchScenario {

	WebDriver driver;

	@Given("user is entering google.com")
	public void user_is_entering_google_com() {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		System.out.println("User is on Google home");
	}

	@When("user clicks the search box")
	public void user_clicks_the_search_box() {

		driver.findElement(By.name("q")).click();
		System.out.println("User is clicking the search box");
	}

	@When("types the search term as {string}")
	public void types_the_search_term_as(String searchTerm) {

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(searchTerm);
		searchBox.submit();
		System.out.println("User is typing the search term");
	}

	@When("the user should see the search results for Tirupur")
	public void the_user_should_see_the_search_results_for_tirupur() {

		boolean resultsCame = driver.findElement(By.partialLinkText("Tirupur")).isDisplayed();
		if (resultsCame) {
			System.out.println("search results came");
		}
	}

	@Then("The Webpage must be closed")
	public void the_webpage_must_be_closed() {

		driver.quit();
		System.out.println("Driver closed sucessfully");
	}

}
