package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class My_Aim_Hook_Step_Defi {

	@Given("I will start a busines")
	public void i_will_start_a_busines() {
	    System.out.println("I will start a busines");
	}

	@When("I will buy luxury house other essentials")
	public void i_will_buy_luxury_house_other_essentials() {
	    System.out.println("I will buy luxury house other essentials");
	}

	@Then("i will help every one who needs it")
	public void i_will_help_every_one_who_needs_it() {
		System.out.println("i will help every one who needs it");
	}
}
