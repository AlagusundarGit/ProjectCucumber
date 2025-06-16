package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features",
					 glue = "stepDefinition",
				   plugin = "html:target/report.html",
			   monochrome = true,
				   dryRun = false,
				     tags = "@smoke"
			   )                                          


public class TestRunner {

}

//to mention which feature file to execute
//to mention which package having the steps
//report creation
//to remove unwanted symbols from console
//to create snippet for undefined test steps
//to run or skip the feature or scenario