package stepDefinitions;

import io.cucumber.java.en.Given;

public class ExpressionStepDefi {

	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {

		System.out.println("Laptop count " + int1);
	}

	@Given("I have {double} CGPA")
	public void i_have_cgpa(Double num) {

		System.out.println("CGPA is " + num);
	}

	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String name, String name2, String name3) {

		System.out.println(name + " is elder to " + name2 + " and " + name3);
	}
}
