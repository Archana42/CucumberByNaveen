package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class BillingSteps {

	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	// if we want to use combination of integer and double use strings in feature file and convert them into 
	// corresponding value in the step definition rather creating an ambiguity of overloading feature in cucumber 6
	// For clarification check naveen Cucumber series 12 video on scenario outline
	@Given("user is on billing page")
	public void user_is_on_billing_page() {

	}

	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billingAmount) {
	
		this.billingAmount = Double.parseDouble(billingAmount);
	}

	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
		
		this.taxAmount = Double.parseDouble(taxAmount);
	}

	@And("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {

	}

	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String finalAmount) {

		this.finalAmount = this.billingAmount + this.taxAmount;
		System.out.println("Expected Final Amount : " + Double.parseDouble(finalAmount));
		System.out.println("Actual Final Amount : " + this.finalAmount);
		 
		Assert.assertTrue(this.finalAmount == Double.parseDouble(finalAmount));
	}
}
