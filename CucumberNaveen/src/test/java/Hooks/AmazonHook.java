package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;

public class AmazonHook {

	@Before("@Smoke") //only tagged for smoke test cases only
	public void setup_browser(Scenario sc) {
		System.out.println("launch chrome browser");
		System.out.println(sc.getName());
	}
	
//	@Before(order = 2)
//	public void setup_url() {
//		System.out.println("launch url");
//	}
//	
//	@After(order = 2)
//	public void tearDown_close(Scenario sc) {
//		System.out.println("Close the broswer");
//		System.out.println(sc.getName());
//	}
	
	@After(order = 1)
	public void tearDown_logout() {
		System.out.println("logout from application");
	}
	
//	@BeforeStep
//	public void takescreenshot() {
//		System.out.println("take the screenshot");
//	}
//	
//	@AfterStep
//	public void refreshPage() {
//		System.out.println("refresh the page");
//	}
}
