package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Add_Future_Plan_Hooks {

	@Before(order = 1)
	public void getExperience() {
		System.out.println("I would get experience my work and have money");
	}
	
	@Before(order = 0)
	public void getDegree() {
		System.out.println("I would get my degree cetrificate");
	}

	@After(order = 1)
	public void enjoyLife() {
		System.out.println("After sucessing, i will enjoying my life");
	}
	
	@After(order = 0)
	public void takeRest() {
		System.out.println("Take rest a wonderful place");
	}
	
}
