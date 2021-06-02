package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\AppFeatures\\Uber.feature"},
		glue = {"stepDefinitions"},
		monochrome=true,	//display the console output in a proper readable format without any question marks
		tags = "@Smoke and @Regression or @Prod",	// or and not can be used learn about them
		plugin = {"pretty"}
		)
public class UberTest {

}
