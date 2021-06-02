package stepDefinitions;

import Implementations.Product;
import Implementations.Search;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search;
	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1: I am on search page");
	}

	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product with name : " + productName + " price : " + price);
	
		product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: Product " + productName + " is Displayed");
		
		search = new Search();
		String name = search.displayProduct(product);
		System.out.println("searched product is : " + name);
		
		Assert.assertEquals(product.getProductName(), name);
	}
	
	@Then("Order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer int1, String string) {

	}

}
